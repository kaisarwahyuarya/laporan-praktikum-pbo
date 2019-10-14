package Jobsheet7;

public class MainPercobaan11841720206Kaisar {

    public static void main(String[] args) {
        System.out.println("Program Testing Manager dan Staff");
        Manager1841720206Kaisar man[] = new Manager1841720206Kaisar[2];
        Staff1841720206Kaisar staff1[] = new Staff1841720206Kaisar[2];
        Staff1841720206Kaisar staff2[] = new Staff1841720206Kaisar[3];

        man[0] = new Manager1841720206Kaisar();
        man[0].setNamaKaisar("Bintol");
        man[0].setNipKaisar("101");
        man[0].setGolonganKaisar("1");
        man[0].setTunjanganKaisar(5000000);
        man[0].setBagianKaisar("Administrasi");

        man[1] = new Manager1841720206Kaisar();
        man[1].setNamaKaisar("Binti");
        man[1].setNipKaisar("102");
        man[1].setGolonganKaisar("1");
        man[1].setTunjanganKaisar(2500000);
        man[1].setBagianKaisar("Pemasaran");

        staff1[0] = new Staff1841720206Kaisar();
        staff1[0].setNamaKaisar("Usman");
        staff1[0].setNipKaisar("0003");
        staff1[0].setGolonganKaisar("2");
        staff1[0].setLemburKaisar(10);
        staff1[0].setGajiLemburKaisar(10000);

        staff1[1] = new Staff1841720206Kaisar();
        staff1[1].setNamaKaisar("Anugrah");
        staff1[1].setNipKaisar("0005");
        staff1[1].setGolonganKaisar("2");
        staff1[1].setLemburKaisar(10);
        staff1[1].setGajiLemburKaisar(55000);
        man[0].setStaffKaisar(staff1);

        staff2[0] = new Staff1841720206Kaisar();
        staff2[0].setNamaKaisar("Hendra");
        staff2[0].setNipKaisar("0004");
        staff2[0].setGolonganKaisar("3");
        staff2[0].setLemburKaisar(15);
        staff2[0].setGajiLemburKaisar(5500);

        staff2[1] = new Staff1841720206Kaisar();
        staff2[1].setNamaKaisar("Arie");
        staff2[1].setNipKaisar("0006");
        staff2[1].setGolonganKaisar("4");
        staff2[1].setLemburKaisar(5);
        staff2[1].setGajiLemburKaisar(100000);

        staff2[2] = new Staff1841720206Kaisar();
        staff2[2].setNamaKaisar("Mentari");
        staff2[2].setNipKaisar("0007");
        staff2[2].setGolonganKaisar("3");
        staff2[2].setLemburKaisar(6);
        staff2[2].setGajiLemburKaisar(20000);
        man[1].setStaffKaisar(staff2);

        man[0].lihatInfoKaisar();
        man[1].lihatInfoKaisar();
    }
}