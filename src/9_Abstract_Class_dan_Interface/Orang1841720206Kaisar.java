package Jobsheet8;

public class Orang1841720206Kaisar {
    
    private String mNama;
    private Hewan1841720206Kaisar mHewanPeliharaan;
    
    public Orang1841720206Kaisar(String nama){
        this.mNama = nama;
    }
    
    public void peliharaHewanKaisar(Hewan1841720206Kaisar hewanPeliharaan){
        this.mHewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanKaisar(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.mHewanPeliharaan.bergerakKaisar();
        System.out.println("------------------------------------------");
    }
}