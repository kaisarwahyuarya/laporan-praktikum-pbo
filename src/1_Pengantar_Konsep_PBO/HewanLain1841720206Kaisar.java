
package Jobsheet1;

public class HewanLain1841720206Kaisar extends Hewan1841720206Kaisar{
      private String mHewan;

    public void setHewanKaisar(String newValue) {
        mHewan = newValue;
    }

    public void cekKaisar() {
        super.cekKaisar();
        System.out.println("Hewan           :" + mHewan);
    }
    
    public static void main(String[] args){
        
        Hewan1841720206Kaisar hwn1 = new Hewan1841720206Kaisar();
        
        hwn1.jenishewanKaisar("Amfibi");
        hwn1.makananKaisar("Bebas");
        hwn1.namaHewanKaisar("Kodok");
        hwn1.JumlahHewanKaisar(10);
        hwn1.kurangKaisar(0);
        hwn1.cekKaisar();
    }
}
