package Jobsheet10;

public class Tester41841720206Kaisar {
    public static void main(String[] args) {
        Owner1841720206Kaisar ow = new Owner1841720206Kaisar();
        
        ElectricityBill1841720206Kaisar eBill = new ElectricityBill1841720206Kaisar(5, "R-1");
        ow.payKaisar(eBill);
        System.out.println("-------------------------");
        
        PermanentEmployee1841720206Kaisar pEmp = new PermanentEmployee1841720206Kaisar("Dedik", 500);
        ow.payKaisar(pEmp);
        System.out.println("-------------------------");
        
        InternshipEmployee1841720206Kaisar iEmp = new InternshipEmployee1841720206Kaisar("Sunarto", 5);
        ow.showMyEmployeeKaisar(pEmp);
        System.out.println("-------------------------");
        ow.showMyEmployeeKaisar(iEmp);
        
//        ow.pay(iEmp);
    }
}
