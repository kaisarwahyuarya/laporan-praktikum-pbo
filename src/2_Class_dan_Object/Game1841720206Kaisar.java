package Jobsheet2;

public class Game1841720206Kaisar{     
    int id;
    String nama;
    String member;
    String namaGame;
    int harga;
    int lamaSewa;
    
    public void tampilPinjamanKaisar(){
        System.out.println("ID        : "+id);
        System.out.println("Nama      : "+nama);
        System.out.println("Member    : "+member);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa : "+lamaSewa);
    }      
        //methood dengan argumen dan nilai balik  (return)
        public int hargaBayarKaisar(int lamaSewa){
            int bayar = lamaSewa * harga;
            return bayar;
    }
    
    
}
