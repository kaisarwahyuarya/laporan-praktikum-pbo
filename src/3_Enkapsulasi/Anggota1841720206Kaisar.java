package Jobsheet3;

public class Anggota1841720206Kaisar {

    private String nNama;
    private String nAlamat;
    private float nSimpanan;

    Anggota1841720206Kaisar(String nama, String alamat) {
        this.nNama = nama;
        this.nAlamat = alamat;
        this.nSimpanan = 0;
    }

    public void setNamaKaisar(String nama) {
        this.nNama = nama;
    }

    public void setAlamatKaisar(String alamat) {
        this.nAlamat = alamat;
    }

    public String getNamaKaisar() {
        return nNama;
    }

    public String getAlamatKaisar() {
        return nAlamat;
    }

    public float getSimpananKaisar() {
        return nSimpanan;
    }

    public void setorKaisar(float uang) {
        nSimpanan += uang;
    }

    public void pinjamKaisar(float uang) {
        nSimpanan -= uang;
    }
}