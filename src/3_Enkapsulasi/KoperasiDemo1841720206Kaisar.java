package Jobsheet3;

public class KoperasiDemo1841720206Kaisar {

    public static void main(String[] args) {
        Anggota1841720206Kaisar anggota1 = new Anggota1841720206Kaisar("Iwan", "Jalan Bongkar");
        System.out.println("Simpanan " + anggota1.getNamaKaisar()
                + " :Rp " + anggota1.getSimpananKaisar());
        anggota1.setNamaKaisar("Iwan Fals");
        anggota1.setAlamatKaisar("Jalan Bento no 212");
        anggota1.setorKaisar(100000);
        System.out.println("Simpanan " + anggota1.getNamaKaisar()
                + " : Rp " + anggota1.getSimpananKaisar());

        anggota1.pinjamKaisar(5000);
        System.out.println("Simpanan " + anggota1.getNamaKaisar()
                + " : Rp " + anggota1.getSimpananKaisar());
    }
}