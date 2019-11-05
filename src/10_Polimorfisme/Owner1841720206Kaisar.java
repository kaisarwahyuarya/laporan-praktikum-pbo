package Jobsheet10;

public class Owner1841720206Kaisar {
    public void payKaisar(Payable1841720206Kaisar p){
        System.out.println("Total payment = "+ p.getPaymentAmountKaisar());
        if (p instanceof ElectricityBill1841720206Kaisar) {
            ElectricityBill1841720206Kaisar eb = (ElectricityBill1841720206Kaisar)p;
            System.out.println(""+eb.getBillInfoKaisar());
        } else if (p instanceof PermanentEmployee1841720206Kaisar) {
            PermanentEmployee1841720206Kaisar pe = (PermanentEmployee1841720206Kaisar)p;
            pe.getEmployeeInfoKaisar();
            System.out.println(""+pe.getEmployeeInfoKaisar());
        }
    }
    public void showMyEmployeeKaisar(Employee1841720206Kaisar e) {
        System.out.println(""+e.getEmployeeInfoKaisar());
        if (e instanceof PermanentEmployee1841720206Kaisar) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}