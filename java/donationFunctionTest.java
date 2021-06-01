import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class donationFunctionTest {

    @Test
    void donationRanking() {
       donationFunction donate1 = new donationFunction();
       donate1.donationRanking(10);
       assertEquals("Bronze",donate1.getRanking());

        donationFunction donate2 = new donationFunction();
        donate1.donationRanking(11);
        assertEquals("Silver",donate1.getRanking());

        donationFunction donate3 = new donationFunction();
        donate1.donationRanking(22);
        assertEquals("Silver",donate1.getRanking());

        donationFunction donate4 = new donationFunction();
        donate1.donationRanking(29);
        assertEquals("Silver",donate1.getRanking());

        donationFunction donate5 = new donationFunction();
        donate1.donationRanking(30);
        assertEquals("Gold",donate1.getRanking());

        donationFunction donate6 = new donationFunction();
        donate1.donationRanking(31);
        assertEquals("Gold",donate1.getRanking());

    }

    @Test
    void getRanking(){
        donationFunction donate = new donationFunction();
        assertEquals("none",donate.getRanking());
    }

}