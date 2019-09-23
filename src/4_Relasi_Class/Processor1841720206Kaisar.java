package Jobsheet4;

public class Processor1841720206Kaisar {

    private String mMerk;
    private double mCache;

    public Processor1841720206Kaisar() {
    }
    
    public Processor1841720206Kaisar(String merk, double cache) {
        this.mMerk = merk;
        this.mCache = cache;
    }

    public String getMerkKaisar() {
        return mMerk;
    }

    public void setMerkKaisar(String merk) {
        this.mMerk = merk;
    }

    public double getCacheKaisar() {
        return mCache;
    }

    public void setCacheKaisar(double cache) {
        this.mCache = cache;
    }

    public void infoKaisar() {
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}