package frontend;

import backend.*;

public class TestBackend1841720206Kaisar {

    public static void main(String[] args) {
        Kategori1841720206Kaisar kat1 = new Kategori1841720206Kaisar("Novel", "Koleksi buku novel");    
        Kategori1841720206Kaisar kat2 = new Kategori1841720206Kaisar("Referensi", "Buku referensi ilmiah");
        Kategori1841720206Kaisar kat3 = new Kategori1841720206Kaisar("Komik", "Komik anak-anak");

// test insert
        kat1.saveKaisar();
        kat2.saveKaisar();
        kat3.saveKaisar();
// test update
        kat2.setKeteranganKaisar("Koleksi buku referensi ilmiah");
        kat2.saveKaisar();
// test delete
        kat3.deleteKaisar();
// test select all
        for (Kategori1841720206Kaisar k : new Kategori1841720206Kaisar().getAllKaisar()) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", Ket: " + k.getKeteranganKaisar());
        }

        // test search
        for (Kategori1841720206Kaisar k : new Kategori1841720206Kaisar().searchKaisar("ilmiah")) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", Ket: " + k.getKeteranganKaisar());
        }
    }
}
