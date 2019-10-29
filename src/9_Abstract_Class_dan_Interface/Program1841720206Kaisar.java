package Jobsheet8;

public class Program1841720206Kaisar {
    public static void main(String[] args) {
        Kucing1841720206Kaisar kucingKampung = new Kucing1841720206Kaisar();
        Ikan1841720206Kaisar lumbaLumba = new Ikan1841720206Kaisar();
        
        Orang1841720206Kaisar ani = new Orang1841720206Kaisar("Ani");
        Orang1841720206Kaisar budi = new Orang1841720206Kaisar("Budi");
        
        ani.peliharaHewanKaisar(kucingKampung);
        budi.peliharaHewanKaisar(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalanKaisar();
        budi.ajakPeliharaanJalanJalanKaisar();
    }
}