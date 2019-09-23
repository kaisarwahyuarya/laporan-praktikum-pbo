package Jobsheet4;

public class Penumpang1841720206Kaisar {

    private String mKtp;
    private String mNama;

    public Penumpang1841720206Kaisar(String ktp, String nama) {
        this.mKtp = ktp;
        this.mNama = nama;
    }

    public String getKtpKaisar() {
        return mKtp;
    }

    public void setKtpKaisar(String ktp) {
        this.mKtp = ktp;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public String infoKaisar() {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
