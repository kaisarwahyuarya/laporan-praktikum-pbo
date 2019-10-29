package Jobsheet8;

public class Rektor1841720206Kaisar{
    
    public void beriSertifikatCumlaudeKaisar(ICumlaude1841720206Kaisar mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?");
       
        mahasiswa.lulusKaisar();
        mahasiswa.meraihIPKTinggiKaisar();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresKaisar(IBerprestasi1841720206Kaisar mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat Mawapres.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
       
        mahasiswa.menjuaraiKompetisiKaisar();
        mahasiswa.membuatPublikasiIlmiahKaisar();
        
        System.out.println("--------------------------------------------");
    }
}
