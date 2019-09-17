package Jobsheet3;

public class T4Anggota1841720206Kaisar {

    public String nama;
    public String noktp;
    public int jumlah;
    public int limit;

    T4Anggota1841720206Kaisar(String noktp, String nama, int limit) {
        this.noktp = noktp;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNamaKaisar() {
        return nama;
    }

    public int getLimitPinjamanKaisar() {
        return limit;
    }

    public void pinjamKaisar(int pinjam) {
        if (pinjam < limit) {
            jumlah = pinjam;
        } else {
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }
    }

    public int getJumlahPinjamanKaisar() {
        return jumlah;
    }

    public void angsurKaisar(int angsur) {
        if (angsur < jumlah * 0.1) {
            jumlah -= angsur;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
