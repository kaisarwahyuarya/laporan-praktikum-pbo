package Jobsheet2;

public class BarangMain1841720206Kaisar {
    public static void main(String[] args) {
        
        Barang_Tugas1841720206Kaisar brg = new Barang_Tugas1841720206Kaisar();
        
        brg.kode = "Nikon";
        brg.namaBarang = "Camera nikon";
        brg.hargaDasar = 5300000;
        brg.diskon = (float) 0.2;
        brg.tampilData();
        
        System.out.println("Harga Jual : "+brg.hitungHargaJual(brg.hargaDasar,brg.diskon));    
    }
}