/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;


public class Anggota1841720206Kaisar {
    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;
    
    public Anggota1841720206Kaisar(){
        
    }
    
    public Anggota1841720206Kaisar(String nama, String alamat, String telepon){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mTelepon = telepon;
    }

    public int getIdanggotaKaisar() {
        return mIdanggota;
    }

    public void setIdanggotaKaisar(int idanggota) {
        this.mIdanggota = idanggota;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public String getAlamatKaisar() {
        return mAlamat;
    }

    public void setAlamatKaisar(String alamat) {
        this.mAlamat = alamat;
    }

    public String getTeleponKaisar() {
        return mTelepon;
    }

    public void setTeleponKaisar(String telepon) {
        this.mTelepon = telepon;
    }
    
    public Anggota1841720206Kaisar getByIdKaisar(int id){
        Anggota1841720206Kaisar anggota = new Anggota1841720206Kaisar();
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM anggota "
                                            + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {                
                anggota = new Anggota1841720206Kaisar();
                anggota.setIdanggotaKaisar(rs.getInt("idanggota"));
                anggota.setNamaKaisar(rs.getString("nama"));
                anggota.setAlamatKaisar(rs.getString("alamat"));
                anggota.setTeleponKaisar(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return anggota;
    }
    
    public ArrayList<Anggota1841720206Kaisar> getAllKaisar(){
        ArrayList<Anggota1841720206Kaisar> ListAnggota = new ArrayList();
        
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM anggota");
        
        try {
            while (rs.next()) {                
                Anggota1841720206Kaisar anggota = new Anggota1841720206Kaisar();
                anggota.setIdanggotaKaisar(rs.getInt("idanggota"));
                anggota.setNamaKaisar(rs.getString("nama"));
                anggota.setAlamatKaisar(rs.getString("alamat"));
                anggota.setTeleponKaisar(rs.getString("telepon"));
                
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720206Kaisar> searchKaisar(String keyword){
        
        ArrayList<Anggota1841720206Kaisar> ListAnggota = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE "
                    + "    nama LIKE '%" + keyword + "%' "
                    + "    OR alamat LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar(sql);
        
        try {
            while (rs.next()) {                
                Anggota1841720206Kaisar anggota = new Anggota1841720206Kaisar();
                anggota.setIdanggotaKaisar(rs.getInt("idanggota"));
                anggota.setNamaKaisar(rs.getString("nama"));
                anggota.setAlamatKaisar(rs.getString("alamat"));
                anggota.setTeleponKaisar(rs.getString("telepon"));
                
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveKaisar(){
        if (getByIdKaisar(mIdanggota).getIdanggotaKaisar() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "     '" + this.mNama + "', "
                    + "     '" + this.mAlamat + "', "
                    + "     '" + this.mTelepon + "' "
                    + "     )";
            this.mIdanggota = DBHelper1841720206Kaisar.insertQueryGetIdKaisar(SQL);
        } else {
            String SQL = "UPDATE anggota SET idanggota = '"+ this.mIdanggota +"', "
                    + "     nama='" + this.mNama + "', "
                    + "     alamat='" + this.mAlamat + "', "
                    + "     telepon='" + this.mTelepon +"' "
                    + "     WHERE idanggota = '" + this.mIdanggota +"'";
            
            DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
        }
    }
    
    public void deleteKaisar(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
    }
}
