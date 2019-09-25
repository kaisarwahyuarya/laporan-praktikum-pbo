package Kuis1;

public class Product1841720206Kaisar {
    
    private String mAsal;
    private String mPabrik;
    private String mBahan;

    public Product1841720206Kaisar() {
    }

    public Product1841720206Kaisar(String asal, String pabrik, String bahan) {
        this.mAsal = asal;
        this.mPabrik = pabrik;
        this.mBahan = bahan;
    }

    public String getAsalKaisar() {
        return mAsal;
    }

    public void setAsalKaisar(String asal) {
        this.mAsal = asal;
    }

    public String getPabrikKaisar() {
        return mPabrik;
    }

    public void setPabrikKaisar(String pabrik) {
        this.mPabrik = pabrik;
    }

    public String getBahanKaisar() {
        return mBahan;
    }

    public void setBahanKaisar(String bahan) {
        this.mBahan = bahan;
    }
    
    public void infoKaisar(){
        System.out.println("Sepatu buatan "+mAsal);
        System.out.println("Nama Pabrik : "+mPabrik);
        System.out.println("Bahan dasar : "+mBahan);
    }
}
