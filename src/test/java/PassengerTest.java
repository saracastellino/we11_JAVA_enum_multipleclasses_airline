import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup() {
        passenger = new Passenger("Dean Martin", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Dean Martin", passenger.getName());
    }

    @Test
    public void canGetNumOfBags() {
        assertEquals(3, passenger.getNumberOfBags());
    }
}
