package Jobsheet4;

public class Customer1841720206Kaisar {

    private String mKtp;
    private String mNama;

    public Customer1841720206Kaisar() {
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
        System.out.println();
        return info;
    }
}
