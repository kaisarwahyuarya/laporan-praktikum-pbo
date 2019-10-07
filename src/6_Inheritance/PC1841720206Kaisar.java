package Jobsheet6;

public class PC1841720206Kaisar extends Komputer1841720206Kaisar {

    public int ukuranMonitor;

    public PC1841720206Kaisar() {

    }

    public PC1841720206Kaisar(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilDataPCKaisar() {
        System.out.println("\nTampil Data PC");
        super.tampilDataKomputerKaisar();
        System.out.println("Ukuran Monitor: " + ukuranMonitor);
    }
}
