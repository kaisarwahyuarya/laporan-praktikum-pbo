package Kuis1;

public class Model1841720206Kaisar {
    
    private String mJenis;
    private String mMerk;
    private String mWarna;
    private Product1841720206Kaisar mProduct;

    public Model1841720206Kaisar() {
    }

    public Model1841720206Kaisar(String jenis, String merk, String warna) {
        this.mJenis = jenis;
        this.mMerk = merk;
        this.mWarna = warna;
    }

    public String getMerkKaisar() {
        return mMerk;
    }

    public void setMerkKaisar(String merk) {
        this.mMerk = merk;
    }

    public String getWarnaKaisar() {
        return mWarna;
    }

    public void setWarnaKaisar(String warna) {
        this.mWarna = warna;
    }

    public String getJenisKaisar() {
        return mJenis;
    }

    public void setJeniskaisar(String jenis) {
        this.mJenis = jenis;
    }
    
    public Product1841720206Kaisar getProductKaisar(){
        return mProduct;
    }
    
    public void setProductKaisar(Product1841720206Kaisar product){
        this.mProduct = product;
    }
    
    public String infoKaisar(){
        String info = "";
        mProduct.infoKaisar();
        info += "\njenis\t: " + this.mJenis + "\n";
        info += "Merk\t: " + this.mMerk + "\n";
        info += "Warna\t: " +this.mWarna + "\n";
        return info;
    }
}
