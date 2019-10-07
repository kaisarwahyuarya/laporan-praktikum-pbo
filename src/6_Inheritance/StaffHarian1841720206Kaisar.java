package Jobsheet6;

public class StaffHarian1841720206Kaisar extends Staff1841720206Kaisar {

    public int jmlJamKerja;

    public StaffHarian1841720206Kaisar() {

    }

    public StaffHarian1841720206Kaisar(String nama, String alamat, String jk, int umur, int gaji, int lembur,
            int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarianKaisar() {
        System.out.println("=====================Data Staff Harian==================");
        super.tampilDataStaffKaisar();
        System.out.println("Jumlah Jam Kerja: " + jmlJamKerja);
        System.out.println("Gaji Bersih: " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
