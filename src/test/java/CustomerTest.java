import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    @Test
    public void testAddRental() {
        Customer Pete = new Customer("Peter");
        Movie Shouf = new Movie("Shouf Shouf Habibi",1);
        Movie Black = new Movie("Black Book",2);

        Pete.addRental(new Rental(Shouf,2));
        Pete.addRental(new Rental(Black,1));
        Pete.update();

        assertEquals(Pete.getOwed(), 7.5);
        assertEquals(Pete.getPoints(), 3);
    }
}
