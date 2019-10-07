package Jobsheet6;

public class Class2B1841720206Kaisar extends Class2A1841720206Kaisar {

    private int mZ;

    public void setZKaisar(int z) {
        this.mZ = z;
    }

    public void getNilaiZKaisar() {
        System.out.println("Nilai Z: " + mZ);
    }

    public void getJumlahKaisar() {
        System.out.println("Jumlah: " + (super.getXKaisar() + super.getYKaisar() + this.mZ));

    }
}
