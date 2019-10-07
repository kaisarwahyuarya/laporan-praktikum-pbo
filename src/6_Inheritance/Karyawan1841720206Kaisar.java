package Jobsheet6;

public class Karyawan1841720206Kaisar {

    public String nama;
    public String alamat;
    public String jk;
    public int umur;
    public int gaji;

    public Karyawan1841720206Kaisar() {

    }

    Karyawan1841720206Kaisar(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.gaji = gaji;
        this.umur = umur;
    }

    public void tampilDataKaryawanKaisar() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jk: " + jk);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
    }
}
