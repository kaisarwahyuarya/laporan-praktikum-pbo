package Jobsheet6;

public class MainTugas1841720206Kaisar {

    public static void main(String[] args) {

        Laptop1841720206Kaisar L = new Laptop1841720206Kaisar();
        System.out.println("DATA LAPTOP");
        L.merk = "ASUS";
        L.kecProsesor = 5;
        L.sizeMemory = 8;
        L.jnsProsesor = "Anvanced Micro Processor";
        L.jnsBatrei = "Nickel Metal Hydride";
        L.tampilDataLaptopKaisar();

        PC1841720206Kaisar pc = new PC1841720206Kaisar();
        pc.merk = "Toshiba";
        pc.kecProsesor = 7;
        pc.sizeMemory = 6;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 1280;
        pc.tampilDataPCKaisar();

        Mac1841720206Kaisar mac = new Mac1841720206Kaisar("Keamanan Yang dirancang Khusus", "Nickel Metal Hydride",
                "Asus", 5, 10, "Anvanced Micro Processor");
        mac.tampilDataMacKaisar();

        Windows1841720206Kaisar windows = new Windows1841720206Kaisar("Desain Keren", "Nickel Metal Hydride",
                "Thosibah", 7, 6, "Intel");
        windows.tampilDataWindowsKaisar();
    }
}
