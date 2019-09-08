package Jobsheet2;

public class TestGame1841720206Kaisar {
    
    public static void main(String[] args) {
        
        Game1841720206Kaisar gm1 = new Game1841720206Kaisar();
        
        gm1.id = 1841720206;
        gm1.nama = "M.Nur Faizin";
        gm1.member = "kaisarvy";
        gm1.namaGame = "GTA V";
        gm1.harga = 500000;
        gm1.lamaSewa = 3;//hari
        gm1.tampilPinjamanKaisar();
        
        //menampilkan dan mengisi argumen untuk mengkalikan harga 
        System.out.println("Harga yang Harus di Bayar adalah : "+gm1.hargaBayarKaisar(3));
    }
}
