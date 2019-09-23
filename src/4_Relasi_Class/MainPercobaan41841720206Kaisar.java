package Jobsheet4;

public class MainPercobaan41841720206Kaisar {

    public static void main(String[] args) {
        Penumpang1841720206Kaisar p = new Penumpang1841720206Kaisar("12345", "Mr. Krab");
        Penumpang1841720206Kaisar budi = new Penumpang1841720206Kaisar("12346", "Mr. Kontol");
        Gerbong1841720206Kaisar gerbong = new Gerbong1841720206Kaisar("A", 10);
        gerbong.setPenumpangKaisar(p, 1);
        System.out.println(gerbong.infoKaisar());
        gerbong.setPenumpangKaisar(budi, 1);
        System.out.println(gerbong.infoKaisar());
    }
}
