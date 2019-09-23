package Jobsheet4;

public class MainPercobaan21841720206Kaisar {

    public static void main(String[] args) {
        Mobil1841720206Kaisar m = new Mobil1841720206Kaisar();
        m.setMerkKaisar("Avanza");
        m.setBiayaKaisar(350000);
        Sopir1841720206Kaisar s = new Sopir1841720206Kaisar();
        s.setNamaKaisar("John Doe");
        s.setBiayaKaisar(200000);
        Pelanggan1841720206Kaisar p = new Pelanggan1841720206Kaisar();
        p.setNamaKaisar("Jane Doe");
        p.setMobilKaisar(m);
        p.setSopirKaisar(s);
        p.setHariKaisar(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalKaisar());
        
        System.out.println(p.getMobilKaisar().getMerkKaisar()); 
    }
}
