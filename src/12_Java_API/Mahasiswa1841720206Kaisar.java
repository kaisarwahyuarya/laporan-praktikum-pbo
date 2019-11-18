package Jobsheet12;

public class Mahasiswa1841720206Kaisar {
    private String mNim, mNama, mAlamat;
    
    public Mahasiswa1841720206Kaisar (String Nim, String Nama, String Alamat) {
        this.mNim = Nim;
        this.mNama = Nama;
        this.mAlamat = Alamat;
    }
    
    public String getNimKaisar(){
        return mNim;
    }
    
    public String getNamaKaisar(){
        return mNama;
    }
    
    public String getAlamatKaisar(){
        return mAlamat;
    }
}
