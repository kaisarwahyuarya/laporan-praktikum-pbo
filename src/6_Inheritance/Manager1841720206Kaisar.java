package Jobsheet6;

public class Manager1841720206Kaisar extends Karyawan1841720206Kaisar {

    public int tunjangan;

    public Manager1841720206Kaisar() {

    }

    public void tampilDataManagerKaisar() {
        super.tampilDataKaryawanKaisar();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + (super.gaji + tunjangan));
    }
}
