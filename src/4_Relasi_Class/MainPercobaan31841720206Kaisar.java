package Jobsheet4;

public class MainPercobaan31841720206Kaisar {

    public static void main(String[] args) {

        Pegawai1841720206Kaisar masinis = new Pegawai1841720206Kaisar("1234", "Spongebob Squarepants");
        Pegawai1841720206Kaisar asisten = new Pegawai1841720206Kaisar("4567", "Patrick Star");
        KeretaApi1841720206Kaisar keretaApi = new KeretaApi1841720206Kaisar("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.infoKaisar());
    }
}