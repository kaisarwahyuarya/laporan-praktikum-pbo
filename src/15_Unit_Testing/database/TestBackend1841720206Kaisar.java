/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author IRGY
 */
public class TestBackend1841720206Kaisar {

    public static void main(String[] args) {
        Kategori1841720206Kaisar kat1 = new Kategori1841720206Kaisar("Novel", "Koleksi buku novel");
        Kategori1841720206Kaisar kat2 = new Kategori1841720206Kaisar("Referensi", "Buku referensi ilmiah");
        Kategori1841720206Kaisar kat3 = new Kategori1841720206Kaisar("Novel", "Komik anak-anak");

        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for (Kategori1841720206Kaisar k : new Kategori1841720206Kaisar().getAll()) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", Ket: " + k.getKeterangan());
        }

        for (Kategori1841720206Kaisar k : new Kategori1841720206Kaisar().search("ilmiah")) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", Ket: " + k.getKeterangan());
        }
    }

}
