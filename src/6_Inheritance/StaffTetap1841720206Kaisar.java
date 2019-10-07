package Jobsheet6;

public class StaffTetap1841720206Kaisar extends Staff1841720206Kaisar {

    public String golongan;
    public int asuransi;

    public StaffTetap1841720206Kaisar() {

    }

    public StaffTetap1841720206Kaisar(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetapKaisar() {
        System.out.println("==================Data Staff Tetap=================");
        super.tampilDataStaffKaisar();
        System.out.println("Golongan: " + golongan);
        System.out.println("Jumlah Asuransi: " + asuransi);
        System.out.println("Gaji Bersih: " + (gaji + lembur - potongan - asuransi));
    }
}
