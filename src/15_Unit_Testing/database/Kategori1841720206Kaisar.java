package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720206Kaisar {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720206Kaisar() {

    }

    public Kategori1841720206Kaisar(String nama, String keterangan) {
        this.mNama = nama;
        this.mKeterangan = keterangan;
    }

    public int getIdkategoriKaisar() {
        return mIdkategori;
    }

    public void setIdkategoriKaisar(int idkategori) {
        this.mIdkategori = idkategori;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public void setNama(String nama) {
        this.mNama = nama;
    }

    public String getKeterangan() {
        return mKeterangan;
    }

    public void setKeterangan(String keterangan) {
        this.mKeterangan = keterangan;
    }

    public Kategori1841720206Kaisar getById(int id) {
        Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("Select * from kategori where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720206Kaisar> getAll() {
        ArrayList<Kategori1841720206Kaisar> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar("Select * from kategori");
        try {
            while (rs.next()) {
                Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720206Kaisar> search(String keyword) {
        ArrayList<Kategori1841720206Kaisar> ListKategori = new ArrayList();
        String sql = "Select * from kategori where nama like '%" + keyword + "%' or keterangan like '%" + keyword + "%'";
        ResultSet rs = DBHelper1841720206Kaisar.selectQueryKaisar(sql);
        try {
            while (rs.next()) {
                Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(mIdkategori).getIdkategoriKaisar() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) values ('" + this.mNama + "','" + this.mKeterangan + "')";
            this.mIdkategori = DBHelper1841720206Kaisar.insertQueryGetIdKaisar(sql);
        } else {
            String SQL = "Update kategori set nama = '" + this.mNama + "', keterangan = '" + this.mKeterangan + "'"
                    + "where idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
        }
    }

    public void delete() {
        String SQL = "Delete from kategori where idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720206Kaisar.executeQueryKaisar(SQL);
    }

    public String toString() {
        return mNama;
    }

    ArrayList<Kategori1841720206Kaisar> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720206Kaisar> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM kategori Where nama = '"
                    + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM kategori Where nama = '"
                    + nama + "'");
        } else {
            rs = DBHelper1841720206Kaisar.selectQueryKaisar("SELECT * FROM kategori Where keterangan'" + keterangan + "'  ");
        }

        try {
            while (rs.next()) {
                Kategori1841720206Kaisar kat = new Kategori1841720206Kaisar();
                kat.setIdkategoriKaisar(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

}
