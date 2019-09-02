package Jobsheet1;

public class Sepeda1841720206Kaisar {
    private String mMerek;
    private String mWarna;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekKaisar(String newValue) {
        mMerek = newValue;
    }
    
    public void gantiGearKaisar(int newValue) {
        mGear = newValue;
    }
    
    public void tambahKecepatanKaisar(int increment) {
        mKecepatan = mKecepatan + increment;
    }
    
    public void remKaisar(int decrement) {
        mKecepatan = mKecepatan - decrement;
    }
    
    public void cetakSatusKaisar() {
        System.out.println("Merek: "+mMerek);
        System.out.println("Kecepatan: "+mKecepatan);
        System.out.println("Gear: "+mGear);
    }
}
