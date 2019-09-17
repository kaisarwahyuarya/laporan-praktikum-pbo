package Jobsheet3;

import java.util.Scanner;

public class T4TestKoperasi1841720206Kaisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        T4Anggota1841720206Kaisar donny = new T4Anggota1841720206Kaisar("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNamaKaisar());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanKaisar());
        System.out.print("Meminjam : ");
        int pinjam = sc.nextInt();
        donny.pinjamKaisar(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanKaisar());
        System.out.print("Meminjam : ");
        int pinjam1 = sc.nextInt();
        donny.pinjamKaisar(pinjam1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanKaisar());
        System.out.print("Angsur : ");
        int angsur = sc.nextInt();
        donny.angsurKaisar(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanKaisar());
        System.out.print("Angsur : ");
        int angsur1 = sc.nextInt();
        donny.angsurKaisar(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanKaisar());
    }
}
