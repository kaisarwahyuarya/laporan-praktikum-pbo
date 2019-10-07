package Jobsheet6;

public class Mac1841720206Kaisar extends Laptop1841720206Kaisar {

    public String security;

    public Mac1841720206Kaisar() {

    }

    public Mac1841720206Kaisar(String security, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }

    public void tampilDataMacKaisar() {
        System.out.println("\nTampil Data Mac");
        super.tampilDataLaptopKaisar();
        System.out.println("Security: " + security);
    }
}
