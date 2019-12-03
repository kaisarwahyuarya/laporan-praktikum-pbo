package frontend;
import backend.*;

public class TestBackendAnggota1841720206Kaisar {
    public static void main(String[] args) {
        Anggota1841720206Kaisar anggota1 = new Anggota1841720206Kaisar("Dimas Bagus W.S", "JL mangga", "083122286711");
        Anggota1841720206Kaisar anggota2 = new Anggota1841720206Kaisar("Helmi Effendi", "JL Manggis", "082141109795");
        Anggota1841720206Kaisar anggota3 = new Anggota1841720206Kaisar("Julia Intan", "JL Durian", "085122286312");
        
        //test insert
        anggota1.saveKaisar();
        anggota2.saveKaisar();
        anggota3.saveKaisar();
        
        //test update
        anggota2.setAlamatKaisar("JL Alpukat");
        anggota2.saveKaisar();
        
        //test delete
        anggota3.deleteKaisar();
        
        //test select all
        for (Anggota1841720206Kaisar anggota : new Anggota1841720206Kaisar().getAllKaisar()) {
            System.out.println("Nama: " + anggota.getNamaKaisar() + ", Ket: " + anggota.getAlamatKaisar());
        }
        
        //test search
        for (Anggota1841720206Kaisar anggota : new Anggota1841720206Kaisar().searchKaisar("JL Alpukat")) {
            System.out.println("Nama: " + anggota.getNamaKaisar() + ", Ket: " + anggota.getAlamatKaisar());
        }
    }
}
