package Jobsheet1;

public class SepedaDemo1841720206Kaisar {

    public static void main(String[] args) {
        
        Sepeda1841720206Kaisar spd1 = new Sepeda1841720206Kaisar();
        Sepeda1841720206Kaisar spd2 = new Sepeda1841720206Kaisar();
        SepedaGunung1841720206Kaisar spd3 = new SepedaGunung1841720206Kaisar();
        
        spd1.setMerekKaisar("Polygon");
        spd1.tambahKecepatanKaisar(10);
        spd1.gantiGearKaisar(2);
        spd1.cetakSatusKaisar();
        
        spd2.setMerekKaisar("Wiim Cycle");
        spd2.tambahKecepatanKaisar(10);
        spd2.gantiGearKaisar(2);
        spd2.tambahKecepatanKaisar(10);
        spd2.gantiGearKaisar(3);
        spd2.cetakSatusKaisar();
        
        spd3.setMerekKaisar("Klinee");
        spd3.tambahKecepatanKaisar(5);
        spd3.gantiGearKaisar(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakSatus();
    }
}
