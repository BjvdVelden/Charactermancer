package CharacterSheet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterSheetTest {

    private final PrintStream out;
    private final ByteArrayOutputStream outputStream;

    public CharacterSheetTest() {
        this.out = System.out;
        this.outputStream = new ByteArrayOutputStream();
    }

    @Before
    public void setUp() {
        System.setOut(new PrintStream(this.outputStream));
    }

    @Test
    void createCharacterSheet() {
    Fighter fighter = new Fighter();
    Assert.assertEquals("ZandKoekjes\r\nMelkChocolade", this.outputStream.toString().trim());

    }

    @After
    public void endTesting() {
        System.setOut(this.out);
    }

}