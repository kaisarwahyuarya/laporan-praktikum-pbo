package Jobsheet4;

public class Mobil1841720206Kaisar {

    private String mMerk;
    private int mBiaya;

    public Mobil1841720206Kaisar() {
    }

    public String getMerkKaisar() {
        return mMerk;
    }

    public void setMerkKaisar(String merk) {
        this.mMerk = merk;
    }

    public int getBiayaKaisar() {
        return mBiaya;
    }

    public void setBiayaKaisar(int biaya) {
        this.mBiaya = biaya;
    }

    public int hitungBiayaMobilKaisar(int hari) {
        return mBiaya * hari;
    }
}
