package frontend;
import backend.*;

public class TestBackendBuku1841720206Kaisar {
   public static void main(String[] args) {
        Kategori1841720206Kaisar novel = new Kategori1841720206Kaisar().getByIdKaisar(74);
        Kategori1841720206Kaisar referensi = new Kategori1841720206Kaisar().getByIdKaisar(75);
       
        Buku1841720206Kaisar buku1 = new Buku1841720206Kaisar(novel, "Timun Mas", "Bang Supil", "Elex Media");
        Buku1841720206Kaisar buku2 = new Buku1841720206Kaisar(referensi, "Aljabar Linier", "Alex Baldwin", "Springer");
        Buku1841720206Kaisar buku3 = new Buku1841720206Kaisar(novel, "The Sphere", "Michael", "Wyane Publis");
        
        //test insert
        buku1.saveKaisar();
        buku2.saveKaisar();
        buku3.saveKaisar();
        
        //test update
        buku2.setJudulKaisar("Aljabar Linier");
        buku2.saveKaisar();
        
        //test delete
        buku3.deleteKaisar();
        
        //test id kategori
        
        //test select all
        for (Buku1841720206Kaisar buku : new Buku1841720206Kaisar().getAllKaisar()) {
            System.out.println("Kategori: " + buku.getKategoriKaisar().getNamaKaisar() + ", Judul: " + buku.getJudulKaisar());
        }
        
        //test search
        for (Buku1841720206Kaisar buku : new Buku1841720206Kaisar().searchKaisar("timun")) {
            System.out.println("Kategori: " + buku.getKategoriKaisar().getNamaKaisar() + ", Judul: " + buku.getJudulKaisar());
        }
    }   
}
