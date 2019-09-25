package Kuis1;

public class Main1841720206Kaisar {
    public static void main(String[] args) {
        
        Product1841720206Kaisar p = new Product1841720206Kaisar();
        Model1841720206Kaisar m = new Model1841720206Kaisar("Hiking","Eiger","Hitam");
        Bayar1841720206Kaisar b = new Bayar1841720206Kaisar();
        
        p.setAsalKaisar("Indonesia");
        p.setPabrikKaisar("Eiger Corp");
        p.setBahanKaisar("Faux Leather");
        m.setProductKaisar(p);
        
        System.out.print(m.infoKaisar());
        
        b.setJumlahKaisar(2);
        b.setHargaKaisar(1500000);
        
        System.out.println("\nAnda membeli " + b.jumlah + " Sepatu " + m.getMerkKaisar());
        System.out.println("Total Harga : "+b.total);
        
        b.totalhargaKaisar();
        b.diskonKaisar();
        b.totaldiskonKaisar();
        b.infoKaisar();
    }
}
