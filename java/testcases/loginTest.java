package testcases;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class loginTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }


    @Test
    public void testCase(){
    Assert.assertEquals("Admin\r\n" +
            "Admin", outputStream.toString()
            .trim());
    }



}
