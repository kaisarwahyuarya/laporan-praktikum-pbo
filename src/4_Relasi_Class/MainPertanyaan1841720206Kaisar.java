package Jobsheet4;

public class MainPertanyaan1841720206Kaisar {

    public static void main(String[] args) {
        
        Pegawai1841720206Kaisar masinis = new Pegawai1841720206Kaisar("1234", "Spongebob Squarepants");
        KeretaApi1841720206Kaisar keretaApi = new KeretaApi1841720206Kaisar("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.infoKaisar());
    }
}
