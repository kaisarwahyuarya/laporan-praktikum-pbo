
package Jobsheet1;

public class Hewan1841720206Kaisar {

    private String mNama;
    private String mJenis;
    private String mMakan;
    private int mJumHewan;

    public void namaHewanKaisar(String newValue) {
        mNama = newValue;
    }

    public void makananKaisar(String mak) {
        mMakan = mak;
    }

    public void jenishewanKaisar(String newValue) {
        mJenis = newValue;
    }

    public void JumlahHewanKaisar(int hew) {
        mJumHewan = mJumHewan + hew;
    }

    public void kurangKaisar(int k) {
        mJumHewan = mJumHewan - k;
    }

    public void cekKaisar() {
        System.out.println("Nama Hewan              :" + mNama);
        System.out.println("Jenis Hewan             :" + mJenis);
        System.out.println("Makanan Hewan           :" + mMakan);
        System.out.println("Jumlah Hewan dikandang  :" + mJumHewan);
    }
}
