
package Jobsheet1;

public class SepedaGunung1841720206Kaisar extends Sepeda1841720206Kaisar {
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakSatus() {
        super.cetakSatusKaisar();
        System.out.println("Tipe Suspensi: "+tipeSuspensi);
    }
}
