package backend;
import java.util.ArrayList;
import java.sql.*;


public class Kategori1841720206Kaisar {
    private int mIdkategori;
    private String mNama;
    private String mKeterangan;
    
    public Kategori1841720206Kaisar(){
        
    }
    
    public Kategori1841720206Kaisar(String nama, String keterangan){
        this.mNama = nama;
        this.mKeterangan = keterangan;
    }

    public int getIdkategoriKaisar() {
        return mIdkategori;
    }

    public void setIdkategoriKaisar(int idkategori) {
        this.mIdkategori = idkategori;
    }
    
    public String toString(){
        return mNama;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public String getKeteranganKaisar() {
        return mKeterangan;
    }

    public void setKeteranganKaisar(String keterangan) {
        this.mKeterangan = keterangan;
    }
    
    public Kategori1841720206Kaisar getByIdKaisar(int id){
        Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM kategori "
                                            + " WHERE idkategori = '" + id + "'");
        
        try {
            while (rs.next()) {                
                kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNamaKaisar(rs.getString("nama"));
                kat.setKeteranganKaisar(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return kat;
    }
    
    public ArrayList<Kategori1841720206Kaisar> getAllKaisar(){
        ArrayList<Kategori1841720206Kaisar> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM kategori");
        
        try {
            while (rs.next()) {                
                Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNamaKaisar(rs.getString("nama"));
                kat.setKeteranganKaisar(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public ArrayList<Kategori1841720206Kaisar> searchKaisar(String keyword){
        
        ArrayList<Kategori1841720206Kaisar> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                    + "    nama LIKE '%" + keyword + "%' "
                    + "    OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar(sql);
        
        try {
            while (rs.next()) {                
                Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNamaKaisar(rs.getString("nama"));
                kat.setKeteranganKaisar(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public void saveKaisar(){
        if (getByIdKaisar(mIdkategori).getIdkategoriKaisar() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + "     '" + this.mNama + "', "
                    + "     '" + this.mKeterangan + "' "
                    + "     )";
            this.mIdkategori = DBHelper1841720206Kaisar.insertQueryGetIdKaisar(SQL);
        } else {
            String SQL = "UPDATE kategori SET idkategori = '"+ this.mIdkategori +"', "
                    + "     nama='" + this.mNama + "', "
                    + "     keterangan='" + this.mKeterangan +"' "
                    + "     WHERE idkategori = '" + this.mIdkategori +"'";
            
            DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
        }
    }
    
    public void deleteKaisar(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
    }
}
