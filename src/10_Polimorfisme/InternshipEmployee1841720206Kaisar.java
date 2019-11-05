package Jobsheet10;

public class InternshipEmployee1841720206Kaisar extends Employee1841720206Kaisar {
    private int length;

    public InternshipEmployee1841720206Kaisar(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLengthKaisar() {
        return length;
    }

    public void setLengthKaisar(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfoKaisar() {
        String info = super.getEmployeeInfoKaisar() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
    
}
