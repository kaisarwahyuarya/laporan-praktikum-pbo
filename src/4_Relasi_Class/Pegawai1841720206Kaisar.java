package Jobsheet4;

public class Pegawai1841720206Kaisar {

    private String mNip;
    private String mNama;
    
    Pegawai1841720206Kaisar(String nip, String nama){
        this.mNama = nama;
        this.mNip = nip;
    }
    public void setNipKaisar(String nip) {
        this.mNip = nip;
    }

    public String getNipKaisar() {
        return mNip;
    }

    public void setNamaKaisar(String nama) {
        this.mNama = nama;
    }

    public String getNamaKaisar() {
        return mNama;
    }

    public String infoKaisar() {
        String info = "";
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }
}
