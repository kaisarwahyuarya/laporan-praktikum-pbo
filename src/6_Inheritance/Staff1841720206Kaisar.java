package Jobsheet6;

public class Staff1841720206Kaisar extends Karyawan1841720206Kaisar {

    public int lembur;
    public int potongan;

    public Staff1841720206Kaisar() {

    }

    Staff1841720206Kaisar(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;

    }

    public void tampilDataStaffKaisar() {
        super.tampilDataKaryawanKaisar();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan: " + potongan);
        System.out.println("Total Gaji: " + (gaji + lembur - potongan));

    }
}
