package anggota;

public class TestBackend1841720206Kaisar {

    public static void main(String[] args) {
        Anggota1841720206Kaisar agt1 = new Anggota1841720206Kaisar("iqbal", "mojokerto", "0293482384");
        Anggota1841720206Kaisar agt2 = new Anggota1841720206Kaisar("agung", "tulungagung", "19203123");
        Anggota1841720206Kaisar agt3 = new Anggota1841720206Kaisar("napis", "kalimantan", "192837213");

        agt1.saveKaisar();
        agt2.saveKaisar();
        agt3.saveKaisar();

        agt2.setAlamatKaisar("kota malang");
        agt2.saveKaisar();

        agt3.deleteKaisar();

        for (Anggota1841720206Kaisar k : new Anggota1841720206Kaisar().getAllKaisar()) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", telp: " + k.getTeleponKaisar() + ", alamat: " + k.getAlamatKaisar());
        }

        for (Anggota1841720206Kaisar k : new Anggota1841720206Kaisar().searchKaisar("ilmiah")) {
            System.out.println("Nama: " + k.getNamaKaisar() + ", telp: " + k.getTeleponKaisar() + ", alamat: " + k.getAlamatKaisar());
        }
    }

}
