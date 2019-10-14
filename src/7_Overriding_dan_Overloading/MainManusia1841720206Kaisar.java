package Jobsheet7;

public class MainManusia1841720206Kaisar {
      public static void main(String[] args) {
        Manusia1841720206Kaisar m = new Manusia1841720206Kaisar();
        Dosen1841720206Kaisar d = new Dosen1841720206Kaisar();
        Mahasiswa1841720206Kaisar mh = new Mahasiswa1841720206Kaisar();
        
        System.out.println("|===================================|");
        System.out.println("|              MANUSIA              |");
        System.out.println("|===================================|");
        m.BernafasKaisar();
        m.MakanKaisar();
        System.out.println("|===================================|");
        System.out.println("|               DOSEN               |");
        System.out.println("|===================================|");
        d.MakanKaisar();
        d.LemburKaisar();
        System.out.println("|===================================|");
        System.out.println("|             MAHASISWA             |");
        System.out.println("|===================================|");
        mh.MakanKaisar();
        mh.TidurKaisar();
    }
}
