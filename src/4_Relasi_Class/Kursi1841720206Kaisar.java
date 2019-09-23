package Jobsheet4;

public class Kursi1841720206Kaisar {

    private String mNomer;
    private Penumpang1841720206Kaisar mPenumpang;

    public Kursi1841720206Kaisar(String nomer) {
        this.mNomer = nomer;
    }

    public String getNomerKaisar() {
        return mNomer;
    }

    public void setNomerKaisar(String nomer) {
        this.mNomer = nomer;
    }

    public Penumpang1841720206Kaisar getPenumpangKaisar() {
        return mPenumpang;
    }

    public void setPenumpangKaisar(Penumpang1841720206Kaisar penumpang) {
        this.mPenumpang = penumpang;
    }

    public String infoKaisar() {
        String info = "";
        info += "Nomor: " + mNomer + "\n";
        if (this.mPenumpang != null) {
            info += "Penumpang: " + mPenumpang.infoKaisar() + "\n";
        }
        else{
            System.out.println("Kursi sudah ditempati");
        }
        return info;
    }
}
