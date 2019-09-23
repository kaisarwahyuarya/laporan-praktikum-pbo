package Jobsheet4;

public class Tujuan1841720206Kaisar {

    private String mTujuan;
    private String mAsal;
    private Tiket1841720206Kaisar tiket;

    public Tujuan1841720206Kaisar() {
    }

    public Tujuan1841720206Kaisar(String tujuan, String asal) {
        this.mTujuan = tujuan;
        this.mAsal = asal;
    }

    public String getAsalKaisar() {
        return mAsal;
    }

    public void setAsalKaisar(String asal) {
        this.mAsal = asal;
    }

    public String getTujuanKaisar() {
        return mTujuan;
    }

    public void setTujuanKaisar(String tujuan) {
        this.mTujuan = tujuan;
    }

    public Tiket1841720206Kaisar getTiketKaisar() {
        return tiket;
    }

    public void setTiketKaisar(Tiket1841720206Kaisar tiket) {
        this.tiket = tiket;
    }

    public String infoKaisar() {
        String info = "";
        tiket.infoKaisar();
        info += "Asal: " + this.mAsal + "\n";
        info += "Tujuan: " + this.mTujuan + "\n";
        return info;
    }
}
