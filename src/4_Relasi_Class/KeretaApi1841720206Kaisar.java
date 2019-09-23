package Jobsheet4;

public class KeretaApi1841720206Kaisar {

    private String mNama;
    private String mKelas;
    private Pegawai1841720206Kaisar mMasinis;
    private Pegawai1841720206Kaisar mAsisten;

    public KeretaApi1841720206Kaisar(String nama, String kelas, Pegawai1841720206Kaisar masinis) {
        this.mNama = nama;
        this.mKelas = kelas;
        this.mMasinis = masinis;
    }

    public KeretaApi1841720206Kaisar(String nama, String kelas, Pegawai1841720206Kaisar masinis, Pegawai1841720206Kaisar asisten) {
        this.mNama = nama;
        this.mKelas = kelas;
        this.mMasinis = masinis;
        this.mAsisten = asisten;
    }
    
    public String infoKaisar() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.infoKaisar() + "\n";
        info += "Asisten: " + this.mAsisten.infoKaisar() + "\n";
        return info;
    }
}
