package Jobsheet2;

public class TestBarang1841720206Kaisar {
    
    public static void main(String[] args) {
        
        Barang1841720206Kaisar brg1 = new Barang1841720206Kaisar();
        
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangKaisar();
        
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " +brg1.tambahStokKaisar(20));
    }
}
