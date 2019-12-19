package unittest;

import database.Kategori1841720206Kaisar;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720206Kaisar {
    
    public static void main(String[] args){
        Result mr = new JUnitCore().runClasses(MessageProcessorTest1841720206Kaisar.class);
        showMessageResult(mr, MessageProcessorTest1841720206Kaisar.class.getSimpleName());
        
        mr = new JUnitCore().runClasses(Kategori1841720206Kaisar.class);
        showMessageResult(mr, Kategori1841720206Kaisar.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mr, String className) {
        if (mr.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mr.wasSuccessful());
        } else {
            for (Failure failure : mr.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
