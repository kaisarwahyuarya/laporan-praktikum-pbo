package Jobsheet3;

public class Motor1841720206Kaisar {

    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void nyalakanMesinKaisar() {
        kontakOn = true;
    }

    public void matikanMesinKaisar() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatanKaisar() {
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off \n");
        }
    }

    public void kurangiKecepatanKaisar() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off \n");
        }
    }

    public void printStatusKaisar() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
