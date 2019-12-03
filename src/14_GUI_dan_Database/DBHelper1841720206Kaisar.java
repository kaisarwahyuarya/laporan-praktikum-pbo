package backend;
import java.sql.*;
import java.util.TimeZone;

public class DBHelper1841720206Kaisar {
    private static Connection mskoneksi;
    
    
    public static void bukaKoneksiKaisar() {
        if (mskoneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbperpus?serverTimezone=" + TimeZone.getDefault().getID();
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mskoneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Koneksi Error");
            }
        } 
    } 
    
    public static int insertQueryGetIdKaisar(String query){
        bukaKoneksiKaisar();
        int num = 0;
        int result = -1;
        
        try {
            Statement stmt = mskoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                result = rs.getInt(1);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        
        return result;
    }
    
    public static boolean executeQueryKaisar(String query){
        bukaKoneksiKaisar();
        boolean result = false;
        
        try {
            Statement stmt = mskoneksi.createStatement();
            stmt.executeUpdate(query);
            
            result = true;
            
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static ResultSet selectQueryKaisar(String query){
        bukaKoneksiKaisar();
        ResultSet rs = null;
        
        try {
            Statement stmt = mskoneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
}
