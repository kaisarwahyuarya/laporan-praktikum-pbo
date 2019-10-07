package Jobsheet6;

public class Tabung1841720206Kaisar extends Bangun1841720206Kaisar {

    protected int t;

    public void setSuperPhiKaisar(double phi) {
        super.phi = phi;
    }

    public void setSuperRKaisar(int r) {
        super.r = r;
    }

    public void setTKaisar(int t) {
        this.t = t;
    }

    public void volumeKaisar() {
        System.out.println("Volume Tabung adalah: " + (super.phi * super.r * super.r * this.t));
    }
}
