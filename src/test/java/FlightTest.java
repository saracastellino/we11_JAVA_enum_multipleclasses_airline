import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FlightTest {
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;


    @Before
    public void setup() {
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(plane, "AZ9823", "CAG", "EDIN", "10:00");
        passenger1 = new Passenger("Marty McFly", 3);
        passenger2 = new Passenger("Doc", 1);
        passenger3 = new Passenger("Jennifer Parker", 2);
        passenger4 = new Passenger("George McFly", 2);
    }

    @Test
    public void canCountPassengers() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNum() {
        assertEquals("AZ9823", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("CAG", flight.getDestination());
    }

    @Test
    public void canGetDeptAirport() {
        assertEquals("EDIN", flight.getDepartureAirport());
    }

    @Test
    public void canGetDeptTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger() {
        flight.add(passenger4);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void availableSeatsNumber() {
        flight.add(passenger1);
        flight.add(passenger2);
        flight.add(passenger3);
        flight.add(passenger4);
        assertEquals(176, flight.getAvailableSeats());
    }

    @Test
    public void canBookSeat() {
        plane = new Plane(PlaneType.CESSNA);
        Flight flight1 = new Flight(plane, "BH9823", "CAG", "OLB", "15:00");
        flight1.bookSeat(passenger4);
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test
    public void canNotBookSeat() {
        plane = new Plane(PlaneType.CESSNA);
        Flight flight1 = new Flight(plane, "BH9823", "CAG", "OLB", "15:00");
        flight1.bookSeat(passenger1);
        flight1.bookSeat(passenger2);
        flight1.bookSeat(passenger3);
        flight1.bookSeat(passenger4);
        assertEquals(3, flight1.getPassengers().size());
    }
}

