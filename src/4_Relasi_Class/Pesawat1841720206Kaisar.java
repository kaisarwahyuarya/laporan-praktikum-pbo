package Jobsheet4;

public class Pesawat1841720206Kaisar {

    private String mJenisPesawat;
    private Tujuan1841720206Kaisar mPenumpang;

    public Pesawat1841720206Kaisar() {
    }

    public Pesawat1841720206Kaisar(String jenisPesawat, Tujuan1841720206Kaisar penumpang) {
        this.mJenisPesawat = jenisPesawat;
        this.mPenumpang = penumpang;
    }

    public String getJenisPesawatKaisar() {
        return mJenisPesawat;
    }

    public void setJenisPesawatKaisar(String jenisPesawat) {
        this.mJenisPesawat = jenisPesawat;
    }

    public Tujuan1841720206Kaisar getPenumpangKaisar() {
        return mPenumpang;
    }

    public void setPenumpangKaisar(Tujuan1841720206Kaisar penumpang) {
        this.mPenumpang = penumpang;
    }

    public String infoKaisar() {
        String info = "";
        info += "Nama Maskapai: " + this.mJenisPesawat + "\n";
        info += this.mPenumpang.infoKaisar() + "\n";
        return info;
    }
}
