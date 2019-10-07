package Jobsheet6;

public class Laptop1841720206Kaisar extends Komputer1841720206Kaisar {

    public String jnsBatrei;

    public Laptop1841720206Kaisar() {

    }

    public Laptop1841720206Kaisar(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilDataLaptopKaisar() {
        super.tampilDataKomputerKaisar();
        System.out.println("Jenis Baterai: " + jnsBatrei);
    }
}
