package Jobsheet6;

public class Windows1841720206Kaisar extends Laptop1841720206Kaisar {

    public String fitur;

    public Windows1841720206Kaisar() {

    }

    public Windows1841720206Kaisar(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory,
            String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }

    public void tampilDataWindowsKaisar() {
        System.out.println("\nTampil Data Windows");
        super.tampilDataLaptopKaisar();
        System.out.println("Fitur pada Windows: " + fitur);
    }
}
