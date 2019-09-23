package Jobsheet4;

public class Laptop1841720206Kaisar {

    private String mMerk;
    private Processor1841720206Kaisar mProc;

    public Laptop1841720206Kaisar() {
    }

    public Laptop1841720206Kaisar(String merk, Processor1841720206Kaisar proc) {
        this.mMerk = merk;
        this.mProc = proc;
    }

    public String getMerkKaisar() {
        return mMerk;
    }

    public void setMerkKaisar(String merk) {
        this.mMerk = merk;
    }

    public Processor1841720206Kaisar getProcKaisar() {
        return mProc;
    }

    public void setProcKaisar(Processor1841720206Kaisar proc) {
        this.mProc = proc;
    }

    public void infoKaisar() {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.infoKaisar();
    }
}
