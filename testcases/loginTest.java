// TODO: Test werkend maken, lukt niet op mijn laptop voor nu

package testcases;
import java.login;
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
        login login = new login();
        login.startLogin();

    Assert.assertEquals("Admin\r\n" +
            "Admin", outputStream.toString()
            .trim());
    }



}
