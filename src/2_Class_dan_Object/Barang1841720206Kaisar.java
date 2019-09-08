package Jobsheet2;

public class Barang1841720206Kaisar {
    
    public String namaBarang;
    public String jenisBarang;
    public int stok;
    
    public void tampilBarangKaisar(){
        System.out.println("Nama Barang  : "+namaBarang);
        System.out.println("Jenis Barang : "+jenisBarang);
        System.out.println("Stok         : "+stok);
}
    //method dengan argumen dan nilai balik (return)
    public int tambahStokKaisar(int barangMasuk){
        int stokBaru = barangMasuk+stok;
        return stokBaru;
    }
}