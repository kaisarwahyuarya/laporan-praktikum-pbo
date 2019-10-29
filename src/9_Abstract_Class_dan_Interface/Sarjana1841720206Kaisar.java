package Jobsheet8;

public class Sarjana1841720206Kaisar extends Mahasiswa1841720206Kaisar implements ICumlaude1841720206Kaisar, IBerprestasi1841720206Kaisar{

    public Sarjana1841720206Kaisar(String nama) {
        super(nama);
    }

    @Override
    public void lulusKaisar() {
        super.kuliahDiKampusKaisar();
        System.out.println("Aku sudah menyelesaikan SKRIPSI"); 
    }

    @Override
    public void meraihIPKTinggiKaisar() {
        System.out.println("IPK-ku lebih dari 3,51");
        
    
    }

    @Override
    public void menjuaraiKompetisiKaisar() {
        System.out.println("Saya telah menjuarai kompetisi NATIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahKaisar() {
        System.out.println("Saya menerbitkan artikel di jurnal NATIONAL"); 
    }
}
