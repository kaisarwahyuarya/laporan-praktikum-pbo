package Jobsheet6;

public class Main5percobaan1841720206Kaisar {

    public static void main(String[] args) {

        Manager1841720206Kaisar m = new Manager1841720206Kaisar();
        m.nama = "Vivin";
        m.alamat = "Jl.Vinolia";
        m.umur = 25;
        m.jk = "Perempuan";
        m.gaji = 3000000;
        m.tunjangan = 1000000;
        m.tampilDataManagerKaisar();

        Staff1841720206Kaisar s = new Staff1841720206Kaisar();
        s.nama = "Lestari";
        s.alamat = "Malang";
        s.umur = 25;
        s.jk = "Perempuan";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilDataStaffKaisar();

        StaffTetap1841720206Kaisar st = new StaffTetap1841720206Kaisar("Budi", "Malang", "Lestari", 20, 2000000,
                250000, 200000, "2A", 1000000);
        st.tampilStaffTetapKaisar();

        StaffHarian1841720206Kaisar sh = new StaffHarian1841720206Kaisar("Indah", " Malang", "Perempuan", 27, 10000,
                100000, 50000, 100);
        sh.tampilStaffHarianKaisar();
    }
}
