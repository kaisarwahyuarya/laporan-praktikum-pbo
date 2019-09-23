package Jobsheet4;

public class Sopir1841720206Kaisar {

    private String mNama;
    private int mBiaya;

    public Sopir1841720206Kaisar() {

    }

    public String getNamaKaisar() {
        return mNama;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public int getBiayaKaisar() {
        return mBiaya;
    }

    public void setBiayaKaisar(int biaya) {
        this.mBiaya = biaya;
    }

    public int hitungBiayaSopirKaisar(int hari) {
        return mBiaya * hari;
    }
}
