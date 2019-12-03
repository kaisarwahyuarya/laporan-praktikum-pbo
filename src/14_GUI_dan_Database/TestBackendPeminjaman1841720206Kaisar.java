package frontend;
import backend.*;

public class TestBackendPeminjaman1841720206Kaisar {
    public static void main(String[] args) {
        Anggota1841720206Kaisar Dimas = new Anggota1841720206Kaisar().getByIdKaisar(19);
        Anggota1841720206Kaisar Helmi = new Anggota1841720206Kaisar().getByIdKaisar(20);
        
        Buku1841720206Kaisar Timun = new Buku1841720206Kaisar().getByIdKaisar(16);
        Buku1841720206Kaisar Aljabar = new Buku1841720206Kaisar().getByIdKaisar(17);
        
        Peminjaman1841720206Kaisar peminjaman1 = new Peminjaman1841720206Kaisar(Dimas, Timun, "2018-12-4", "2018-12-12");
        Peminjaman1841720206Kaisar peminjaman2 = new Peminjaman1841720206Kaisar(Helmi, Aljabar, "2018-12-5", "2018-12-15");
        
        peminjaman1.saveKaisar();
        peminjaman2.saveKaisar();

        for (Peminjaman1841720206Kaisar peminjaman : new Peminjaman1841720206Kaisar().getAllKaisar()) {
            System.out.println("Id Peminjaman: " + peminjaman.getIdpeminjamanKaisar() + 
                            ", Id Buku: " + peminjaman.getBukuKaisar().getIdbukuKaisar() + 
                            ", Tanggal Pinjam: " + peminjaman.getTanggalpinjamKaisar() +
                            ", Tanggal Kembali: " + peminjaman.getTanggalkembaliKaisar());
        } 
        
        //test search
        for (Peminjaman1841720206Kaisar peminjaman : new Peminjaman1841720206Kaisar().searchKaisar("Dimas")) {
            System.out.println("Nama Anggota");
            System.out.println("Nama: " + peminjaman.getAnggotaKaisar().getNamaKaisar());
        }
        
        for (Peminjaman1841720206Kaisar peminjaman : new Peminjaman1841720206Kaisar().searchKaisar("Timun")) {
            System.out.println("Judul Buku");
            System.out.println("Judul Buku: " + peminjaman.getBukuKaisar().getJudulKaisar());
        }
        
        
    }
}
