package Jobsheet4;

public class Gerbong1841720206Kaisar {

    private String mKode;
    private Kursi1841720206Kaisar[] mArrayKursi;
    
    public Gerbong1841720206Kaisar(String kode, int jumlah) {
        this.mKode = kode;
        this.mArrayKursi = new Kursi1841720206Kaisar[jumlah];
        this.initKursiKaisar();
    }

    private void initKursiKaisar() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720206Kaisar(String.valueOf(i + 1));
        }
    }

    public String getKodeKaisar() {
        return mKode;
    }

    public void setKodeKaisar(String kode) {
        this.mKode = kode;
    }

    public Kursi1841720206Kaisar[] getArraykursiKaisar() {
        return mArrayKursi;
    }

    public void setArraykursiKaisar(Kursi1841720206Kaisar[] arraykursi) {
        this.mArrayKursi = arraykursi;
    }

    public String infoKaisar() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720206Kaisar kursi : mArrayKursi) {
            info += kursi.infoKaisar();
        }
        return info;
    }
    
    public void setPenumpangKaisar(Penumpang1841720206Kaisar penumpang, int nomer) {
        this.mArrayKursi[nomer - 1].setPenumpangKaisar(penumpang);
    }
}
