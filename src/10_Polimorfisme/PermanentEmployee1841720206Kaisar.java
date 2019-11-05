package Jobsheet10;

public class PermanentEmployee1841720206Kaisar extends Employee1841720206Kaisar implements Payable1841720206Kaisar {
    private int salary;

    public PermanentEmployee1841720206Kaisar(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryKaisar() {
        return salary;
    }

    public void setSalaryKaisar(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountKaisar() {
        return (int) (salary + 0.05 * salary);
    }
    
    @Override
    public String getEmployeeInfoKaisar() {
        String info = super.getEmployeeInfoKaisar() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
    
    
    
}
