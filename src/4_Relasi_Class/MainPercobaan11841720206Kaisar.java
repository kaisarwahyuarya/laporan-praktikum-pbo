package Jobsheet4;

public class MainPercobaan11841720206Kaisar {

    public static void main(String[] args) {

        Processor1841720206Kaisar p = new Processor1841720206Kaisar("Intel i5", 3);
        Laptop1841720206Kaisar L = new Laptop1841720206Kaisar("Thinkpad", new Processor1841720206Kaisar("Intel i5", 3)); 

        L.infoKaisar();

        Processor1841720206Kaisar p1 = new Processor1841720206Kaisar();
        p1.setMerkKaisar("Intel i5");
        p1.setCacheKaisar(4);
        Laptop1841720206Kaisar L1 = new Laptop1841720206Kaisar();
        L1.setMerkKaisar("Thinkpad");
        L1.setProcKaisar(p1);
        L1.infoKaisar();
    }
}
