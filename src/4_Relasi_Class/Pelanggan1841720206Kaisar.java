package Jobsheet4;

public class Pelanggan1841720206Kaisar {

    private String mNama;
    private Mobil1841720206Kaisar mMobil;
    private Sopir1841720206Kaisar mSopir;
    private int mHari;
 
    public String getNamaKaisar() {
        return mNama;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public Mobil1841720206Kaisar getMobilKaisar() {
        return mMobil;
    }

    public void setMobilKaisar(Mobil1841720206Kaisar mobil) {
        this.mMobil = mobil;
    }

    public Sopir1841720206Kaisar getSopirKaisar() {
        return mSopir;
    }

    public void setSopirKaisar(Sopir1841720206Kaisar sopir) {
        this.mSopir = sopir;
    }

    public int getHariKaisar() {
        return mHari;
    }

    public void setHariKaisar(int hari) {
        this.mHari = hari;
    }

    public int hitungBiayaTotalKaisar() {
        return mMobil.hitungBiayaMobilKaisar(mHari) + mSopir.hitungBiayaSopirKaisar(mHari);
    }
}
