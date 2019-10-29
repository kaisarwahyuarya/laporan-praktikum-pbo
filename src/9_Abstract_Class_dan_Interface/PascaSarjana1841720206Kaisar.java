package Jobsheet8;

public class PascaSarjana1841720206Kaisar extends Mahasiswa1841720206Kaisar implements ICumlaude1841720206Kaisar, IBerprestasi1841720206Kaisar{

    public PascaSarjana1841720206Kaisar(String nama) {
        super(nama);
    }

    @Override
    public void lulusKaisar() {
        super.kuliahDiKampusKaisar();
        System.out.println("Aku sudah menyelesaikan TESIS"); 
    }

    @Override
    public void meraihIPKTinggiKaisar() {
        System.out.println("IPK-ku lebih dari 3,71"); 
    } 

    @Override
    public void menjuaraiKompetisiKaisar() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahKaisar() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL"); 
    }
}
