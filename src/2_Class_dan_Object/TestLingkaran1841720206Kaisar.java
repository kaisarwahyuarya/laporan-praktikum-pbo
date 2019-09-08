package Jobsheet2;
import java.util.Scanner;
public class TestLingkaran1841720206Kaisar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            Lingkaran1841720206Kaisar lgn1 = new Lingkaran1841720206Kaisar();
            
            
            System.out.println(" Masukkan Nilai jari-jari : ");
            lgn1.r = sc.nextDouble();
                 
            System.out.println("\nLuas Lingkaran : "+lgn1.hitungLuas(3.14));
            System.out.println("Luas Keliling : "+lgn1.hitungKeliling(3.14));
    }
}