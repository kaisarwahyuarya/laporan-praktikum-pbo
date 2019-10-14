package Jobsheet7;

public class Staff1841720206Kaisar extends Karyawan1841720206Kaisar {

    private int mLembur;
    private double mGajiLembur;

    public int getLemburKaisar() {
        return mLembur;
    }

    public void setLemburKaisar(int lembur) {
        this.mLembur = lembur;
    }

    public double getGajiLemburKaisar() {
        return mGajiLembur;
    }

    public void setGajiLemburKaisar(double gajiLembur) {
        this.mGajiLembur = gajiLembur;
    }

    public double getGajiKaisar(int lembur, double gajiLembur) {
        return super.getGajiKaisar() + lembur * gajiLembur;
    }

    public double getGajiKaisar() {
        return super.getGajiKaisar() + mLembur * mGajiLembur;
    }

    public void lihatInfoKaisar() {
        System.out.println("NIP : " + this.getNipKaisar());
        System.out.println("Nama :" + this.getNamaKaisar());
        System.out.println("Golongan : " + this.getGolonganKaisar());
        System.out.println("Jml Lembur : " + this.getLemburKaisar());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLemburKaisar());
        System.out.printf("Gaji :%.0f\n", this.getGajiKaisar());
        System.out.println("");
    }
}
