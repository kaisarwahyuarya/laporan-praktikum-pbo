package Jobsheet7;

public class Manager1841720206Kaisar extends Karyawan1841720206Kaisar {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720206Kaisar st[];

    public double getTunjanganKaisar() {
        return mTunjangan;
    }

    public void setTunjanganKaisar(double tunjangan) {
        this.mTunjangan = tunjangan;
    }

    public String getBagianKaisar() {
        return mBagian;
    }

    public void setBagianKaisar(String bagian) {
        this.mBagian = bagian;
    }

    public void setStaffKaisar(Staff1841720206Kaisar[] st) {
        this.st = st;
    }

    public void viewStaffKaisar() {
        int i;
        System.out.println("----------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoKaisar();
        }
        System.out.println("----------------------");
    }

    public void lihatInfoKaisar() {
        System.out.println("Manager : " + this.getBagianKaisar());
        System.out.println("NIP : " + this.getNipKaisar());
        System.out.println("Nama : " + this.getNamaKaisar());
        System.out.println("Golongan : " + this.getGolonganKaisar());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjanganKaisar());
        System.out.printf("Gaji :%.0f\n", this.getGajiKaisar());
        System.out.println("Bagian : " + this.getBagianKaisar());
        this.viewStaffKaisar();
    }

    public double getGajiKaisar() {
        return super.getGajiKaisar() + mTunjangan;
    }
}