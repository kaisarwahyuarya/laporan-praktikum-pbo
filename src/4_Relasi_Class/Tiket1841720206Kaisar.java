package Jobsheet4;

public class Tiket1841720206Kaisar {

    private String mHarga;
    private String mJenistiket;

    public Tiket1841720206Kaisar() {
    }

    public Tiket1841720206Kaisar(String harga, String jenistiket) {
        this.mHarga = harga;
        this.mJenistiket = jenistiket;
    }

    public String getHargaKaisar() {
        return mHarga;
    }

    public void setHargaKaisar(String harga) {
        this.mHarga = harga;
    }

    public String getJenisTiketKaisar() {
        return mJenistiket;
    }

    public void setJenisTiketKaisar(String jenistiket) {
        this.mJenistiket = jenistiket;
    }

    public void infoKaisar() {
        System.out.printf("Harga : %s\n", mHarga);
        System.out.printf("Jenis Tiket: %s\n", mJenistiket);
    }
}
