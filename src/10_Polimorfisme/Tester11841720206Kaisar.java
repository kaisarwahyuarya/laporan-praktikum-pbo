package Jobsheet10;

public class Tester11841720206Kaisar {
    public static void main(String[] args) {
        PermanentEmployee1841720206Kaisar pEmp = new PermanentEmployee1841720206Kaisar("Dedik", 500);
        InternshipEmployee1841720206Kaisar iEmp = new InternshipEmployee1841720206Kaisar("Sunarto", 5);
        ElectricityBill1841720206Kaisar eBill = new ElectricityBill1841720206Kaisar(5, "R-1");
        
        Employee1841720206Kaisar e;
        Payable1841720206Kaisar p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}