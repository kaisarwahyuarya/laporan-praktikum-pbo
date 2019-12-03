/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;

public class Peminjaman1841720206Kaisar {
    private int mIdpeminjaman;
    private Anggota1841720206Kaisar mAnggota = new Anggota1841720206Kaisar();
    private Buku1841720206Kaisar mBuku = new Buku1841720206Kaisar();
    private String mTanggalpinjam;
    private String mTanggalkembali;
    
    public Peminjaman1841720206Kaisar(){
        
    }
    
    public  Peminjaman1841720206Kaisar(Anggota1841720206Kaisar anggota, Buku1841720206Kaisar buku, String tanggalpinjam, String tanggalkembali){
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalpinjam = tanggalpinjam;
        this.mTanggalkembali = tanggalkembali;
    }
    
    public int getIdpeminjamanKaisar() {
        return mIdpeminjaman;
    }

    public void setIdpeminjamanKaisar(int idpeminjaman) {
        this.mIdpeminjaman = idpeminjaman;
    }

    public Anggota1841720206Kaisar getAnggotaKaisar() {
        return mAnggota;
    }

    public void setAnggotaKaisar(Anggota1841720206Kaisar anggota) {
        this.mAnggota = anggota;
    }

    public Buku1841720206Kaisar getBukuKaisar() {
        return mBuku;
    }

    public void setBukuKaisar(Buku1841720206Kaisar buku) {
        this.mBuku = buku;
    }

    public String getTanggalpinjamKaisar() {
        return mTanggalpinjam;
    }

    public void setTanggalpinjamKaisar(String tanggalpinjam) {
        this.mTanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembaliKaisar() {
        return mTanggalkembali;
    }

    public void setTanggalkembaliKaisar(String tanggalkembali) {
        this.mTanggalkembali = tanggalkembali;
    }
    
    public Peminjaman1841720206Kaisar getByIdKaisar(int id){
        Peminjaman1841720206Kaisar peminjaman = new Peminjaman1841720206Kaisar();
     
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku,"
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {                
                peminjaman = new Peminjaman1841720206Kaisar();
                peminjaman.setIdpeminjamanKaisar(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaKaisar().setIdanggotaKaisar(rs.getInt("idanggota"));
                peminjaman.getAnggotaKaisar().setNamaKaisar(rs.getString("nama"));
                peminjaman.getBukuKaisar().setIdbukuKaisar(rs.getInt("idbuku"));
                peminjaman.getBukuKaisar().setJudulKaisar(rs.getString("judul"));
                peminjaman.setTanggalpinjamKaisar(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliKaisar(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720206Kaisar> getAllKaisar(){
        ArrayList<Peminjaman1841720206Kaisar> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku ");
        
        try {
            while (rs.next()) {                
                Peminjaman1841720206Kaisar peminjaman = new Peminjaman1841720206Kaisar();
                peminjaman.setIdpeminjamanKaisar(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaKaisar().setIdanggotaKaisar(rs.getInt("idanggota"));
                peminjaman.getAnggotaKaisar().setNamaKaisar(rs.getString("nama"));
                peminjaman.getBukuKaisar().setIdbukuKaisar(rs.getInt("idbuku"));
                peminjaman.getBukuKaisar().setJudulKaisar(rs.getString("judul"));
                peminjaman.setTanggalpinjamKaisar(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliKaisar(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720206Kaisar> searchKaisar(String keyword){
        
        ArrayList<Peminjaman1841720206Kaisar> ListPeminjaman = new ArrayList();
        

        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE a.nama IN (SELECT a.nama FROM anggota WHERE a.nama LIKE '%" + keyword + "%') "
                                        + "     OR b.judul IN (SELECT b.judul FROM buku WHERE b.judul LIKE '%" + keyword + "%') ");
                                        
//                                                + "     OR a.idanggota '" + keyword + "' ");
        
        try {
            while (rs.next()) {                
                Peminjaman1841720206Kaisar peminjaman = new Peminjaman1841720206Kaisar();
                peminjaman.setIdpeminjamanKaisar(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaKaisar().setIdanggotaKaisar(rs.getInt("idanggota"));
                peminjaman.getAnggotaKaisar().setNamaKaisar(rs.getString("nama"));
                peminjaman.getBukuKaisar().setIdbukuKaisar(rs.getInt("idbuku"));
                peminjaman.getBukuKaisar().setJudulKaisar(rs.getString("judul"));
                peminjaman.setTanggalpinjamKaisar(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliKaisar(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    
    public void saveKaisar(){
        if (getByIdKaisar(mIdpeminjaman).getIdpeminjamanKaisar()== 0) {
            
            String SQL = "INSERT INTO peminjaman (`idanggota`, `idbuku`, `tanggalpinjam`, `tanggalkembali`) VALUES("
                    + "     '" + this.getAnggotaKaisar().getIdanggotaKaisar() + "', "
                    + "     '" + this.getBukuKaisar().getIdbukuKaisar() + "', "
                    + "     '" + this.mTanggalpinjam + "', "
                    + "     '" + this.mTanggalkembali + "' "
                    + "     )";
            this.mIdpeminjaman = DBHelper1841720206Kaisar.insertQueryGetIdKaisar(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "     idanggota='" + this.getAnggotaKaisar().getIdanggotaKaisar() + "', "
                    + "     idbuku='" + this.getBukuKaisar().getIdbukuKaisar() + "', "
                    + "     tanggalpinjam='" + this.mTanggalpinjam + "', "
                    + "     tanggalkembali='" + this.mTanggalkembali +"' "
                    + "     WHERE idpeminjaman = '" + this.mIdpeminjaman +"'";
            DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
        }
    }
    
    public void deleteKaisar(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
    }
    
}
