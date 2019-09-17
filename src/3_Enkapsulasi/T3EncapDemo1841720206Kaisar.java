package Jobsheet3;

public class T3EncapDemo1841720206Kaisar {

    private String mName;
    private int mAge;

    public String getNameKaisar() {
        return mName;
    }

    public void setNameKaisar(String newName) {
        mName = newName;
    }

    public int getAgeKaisar() {
        return mAge;
    }

    public void setAgeKaisar(int newAge) {
        if (newAge < 18 && newAge > 30) {
            mAge = newAge;
        }
    }
}
