package backend;
import java.util.ArrayList;
import java.sql.*;

public class Buku1841720206Kaisar {
    private int mIdbuku;
    private Kategori1841720206Kaisar mKategori = new Kategori1841720206Kaisar();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;
    
    public Buku1841720206Kaisar(){
        
    }
    
    public Buku1841720206Kaisar(Kategori1841720206Kaisar kategori, String judul, String penerbit, String penulis){
        this.mKategori = kategori;
        this.mJudul = judul;
        this.mPenerbit = penerbit;
        this.mPenulis = penulis;
    }

    public int getIdbukuKaisar() {
        return mIdbuku;
    }

    public void setIdbukuKaisar(int idbuku) {
        this.mIdbuku = idbuku;
    }
    
    public void setKategoriKaisar(Kategori1841720206Kaisar kategori){
        this.mKategori = kategori;
    }
    
    public Kategori1841720206Kaisar getKategoriKaisar(){
        return mKategori;
    }

    public String getJudulKaisar() {
        return mJudul;
    }

    public void setJudulKaisar(String judul) {
        this.mJudul = judul;
    }

    public String getPenerbitKaisar() {
        return mPenerbit;
    }

    public void setPenerbitKaisar(String penerbit) {
        this.mPenerbit = penerbit;
    }

    public String getPenulisKaisar() {
        return mPenulis;
    }

    public void setPenulisKaisar(String penulis) {
        this.mPenulis = penulis;
    }

    public Buku1841720206Kaisar getByIdKaisar(int id){
        Buku1841720206Kaisar buku = new Buku1841720206Kaisar();
     
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {                
                buku = new Buku1841720206Kaisar();
                buku.setIdbukuKaisar(rs.getInt("idbuku"));
                buku.getKategoriKaisar().setIdkategoriKaisar(rs.getInt("idkategori"));
                buku.getKategoriKaisar().setNamaKaisar(rs.getString("nama"));
                buku.getKategoriKaisar().setKeteranganKaisar(rs.getString("keterangan"));
                buku.setJudulKaisar(rs.getString("judul"));
                buku.setPenerbitKaisar(rs.getString("penerbit"));
                buku.setPenulisKaisar(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return buku;
    }
    
    public ArrayList<Buku1841720206Kaisar> getAllKaisar(){
        ArrayList<Buku1841720206Kaisar> ListBuku = new ArrayList();
        
//        ResultSet rs = DBHelper.selectQuery("SELECT * FROM buku");

        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        
        try {
            while (rs.next()) {                
                Buku1841720206Kaisar buku = new Buku1841720206Kaisar();
                buku.setIdbukuKaisar(rs.getInt("idbuku"));
                buku.getKategoriKaisar().setIdkategoriKaisar(rs.getInt("idkategori"));
                buku.getKategoriKaisar().setNamaKaisar(rs.getString("nama"));
                buku.getKategoriKaisar().setKeteranganKaisar(rs.getString("keterangan"));
                buku.setJudulKaisar(rs.getString("judul"));
                buku.setPenerbitKaisar(rs.getString("penerbit"));
                buku.setPenulisKaisar(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720206Kaisar> searchKaisar(String keyword){
        
        ArrayList<Buku1841720206Kaisar> ListBuku = new ArrayList();
        

        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.judul LIKE '%" + keyword + "%' "
                                        + "     OR b.penerbit LIKE '%" + keyword + "%' "
                                        + "     OR b.penulis LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {                
                Buku1841720206Kaisar buku = new Buku1841720206Kaisar();
                buku.setIdbukuKaisar(rs.getInt("idbuku"));
                buku.getKategoriKaisar().setIdkategoriKaisar(rs.getInt("idkategori"));
                buku.getKategoriKaisar().setNamaKaisar(rs.getString("nama"));
                buku.getKategoriKaisar().setKeteranganKaisar(rs.getString("keterangan"));
                buku.setJudulKaisar(rs.getString("judul"));
                buku.setPenerbitKaisar(rs.getString("penerbit"));
                buku.setPenulisKaisar(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    
    public void saveKaisar(){
        if (getByIdKaisar(mIdbuku).getIdbukuKaisar()== 0) {
            
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "     '" + this.mJudul + "', "
                    + "     '" + this.getKategoriKaisar().getIdkategoriKaisar() + "', "
                    + "     '" + this.mPenulis + "', "
                    + "     '" + this.mPenerbit + "' "
                    + "     )";
            this.mIdbuku = DBHelper1841720206Kaisar.insertQueryGetIdKaisar(SQL);
        } else {
            Kategori1841720206Kaisar kategori = new Kategori1841720206Kaisar();
            
//            String SQL = "UPDATE buku SET idbuku = '"+ this.idbuku +"', "
//                    + "     idkategori='" + this.getKategori().getIdkategori() + "', "
//                    + "     judul='" + this.judul + "', "
//                    + "     penerbit='" + this.penerbit + "', "
//                    + "     penulis='" + this.penulis +"' "
//                    + "     WHERE idbuku = '" + this.idbuku +"'";
    
            String SQL = "UPDATE buku SET "
                    + "     judul='" + this.mJudul + "', "
                    + "     idkategori='" + this.getKategoriKaisar().getIdkategoriKaisar() + "', "
                    + "     penulis='" + this.mPenulis + "', "
                    + "     penerbit='" + this.mPenerbit +"' "
                    + "     WHERE idbuku = '" + this.mIdbuku +"'";
            DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
        }
    }
    
    public void deleteKaisar(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
    }
}
