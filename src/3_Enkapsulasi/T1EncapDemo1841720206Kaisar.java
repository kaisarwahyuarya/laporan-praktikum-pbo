package Jobsheet3;

public class T1EncapDemo1841720206Kaisar {

    private String name;
    private int age;

    public String getNameKaisar() {
        return name;
    }

    public void setNameKaisar(String newName) {
        name = newName;
    }

    public int getAgeKaisar() {
        return age;
    }

    public void setAgeKaisar(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}
