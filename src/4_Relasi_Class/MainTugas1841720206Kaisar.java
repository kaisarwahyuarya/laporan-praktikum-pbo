package Jobsheet4;

public class MainTugas1841720206Kaisar {

    public static void main(String[] args) {
        Customer1841720206Kaisar c = new Customer1841720206Kaisar();
        Pesawat1841720206Kaisar p = new Pesawat1841720206Kaisar();
        Tujuan1841720206Kaisar j = new Tujuan1841720206Kaisar("Tolitoli", "Surabaya");
        Tiket1841720206Kaisar t = new Tiket1841720206Kaisar("Rp. 2000000", "Economy");

        c.setNamaKaisar("Kaisar Wahyu Arya");
        c.setKtpKaisar("7204080000000007");
        p.setJenisPesawatKaisar("Lion Air");
        j.setTiketKaisar(t);
        
        System.out.println(c.infoKaisar());
        System.out.println(j.infoKaisar());
    }
}
