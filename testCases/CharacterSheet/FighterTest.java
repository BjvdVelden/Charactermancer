package CharacterSheet;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    Fighter fighter = new Fighter();


    @Test
    void getCharacterClass() {

        assertEquals("Fighter", fighter.getCharacterClass());
    }



    @Test
    void showCharactersheet() {
    }
}