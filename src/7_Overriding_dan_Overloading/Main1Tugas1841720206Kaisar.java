package Jobsheet7;

public class Main1Tugas1841720206Kaisar {
    
    public static void main(String[] args) {
    
        Segitiga1841720206Kaisar sgt = new Segitiga1841720206Kaisar();
        System.out.println("Total 180 - sudut A (10)= "+sgt.totalSudutKaisar(10));
        
        System.out.println("Total 180 - (sudutA + sudutB) = "+sgt.totalSudutKaisar(10, 30));
        
        System.out.println("Total sisiA + sisiB + sisiC = "+sgt.kelilingKaisar(10, 45, 25));
        
        System.out.println("Total c =  " +sgt.kelilingKaisar(25, 23));
        
    }
}
