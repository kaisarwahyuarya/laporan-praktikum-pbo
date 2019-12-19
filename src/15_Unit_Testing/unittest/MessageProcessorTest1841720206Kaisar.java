package unittest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MessageProcessorTest1841720206Kaisar {

    MessageProcessor1841720206Kaisar mp;

    public MessageProcessorTest1841720206Kaisar() {
        mp = new MessageProcessor1841720206Kaisar();
        mp.setSenderKaisar("Ronaldo");
        mp.setRecipientKaisar("Rafael");
        mp.setMessageKaisar("Whats up bro?");
    }

    @BeforeClass
    public static void setUpClassKaisar() {
    }

    @AfterClass
    public static void tearDownClassKaisar() {
    }

    @Before
    public void setUpKaisar() {
    }

    @After
    public void tearDownKaisar() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testShowMessageKaisar() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormatKaisar());
    }
}
