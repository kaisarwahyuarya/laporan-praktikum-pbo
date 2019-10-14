package Jobsheet7;

public class Segitiga1841720206Kaisar {

    private int mSudut;

    public int totalSudutKaisar(int sudutA) {
        return mSudut = 180 - sudutA;
    }

    public int totalSudutKaisar(int sudutA, int sudutB) {
        return mSudut = 180 - (sudutA + sudutB);
    }

    public int kelilingKaisar(int sisiA, int sisiB, int sisiC) {
        return mSudut = sisiA + sisiB + sisiC;
    }

    public double kelilingKaisar(int sisiA, int sisiB) {
        return Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
}
