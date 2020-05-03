import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setup() {
        plane = new Plane(PlaneType.CESSNA);
        flight = new Flight(plane, "BH9823", "CAG", "OLB", "15:00");
        passenger1 = new Passenger("Marty McFly", 3);
        passenger2 = new Passenger("Doc", 1);
        passenger3 = new Passenger("Jennifer Parker", 2);
        flightManager = new FlightManager(plane, flight);
    }

    @Test
    public void canCountPassengers() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void checkMaxBagsWeightForPassenger() {
        assertEquals(16, flightManager.maxBagsWeightForPassenger());
    }

    @Test
    public void checkBagsmaxBagsBookedWeightWeight() {
        flight.add(passenger1);
        flight.add(passenger2);
        flight.add(passenger3);
        assertEquals(48, flightManager.bagsBookedWeight());
    }

    @Test
    public void checkBagsReservedWeightLeft() {
        flight.add(passenger1);
        flight.add(passenger2);
        assertEquals(16, flightManager.bagsReservedWeightLeft());
    }
}
