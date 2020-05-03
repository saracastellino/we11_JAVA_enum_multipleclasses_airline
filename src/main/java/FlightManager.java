import java.util.ArrayList;

public class FlightManager {
    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Flight flight) {
        this.plane = plane;
        this.flight = flight;
    }

    public ArrayList<Passenger> getPassengers() {
        return flight.getPassengers();
    }

    // assuming max weight allocated for bags = 1/20 of the total plane weight
    public int maxBagsWeightForPassenger() {
        int bagsPayloadMaxWeight = plane.getWeight() / 20;
        int maxBagsWeightForPassenger = (bagsPayloadMaxWeight / plane.getCapacity());
        return maxBagsWeightForPassenger;
    }

    public int maxBagsWeightForBookedPassenger() {
        int total = 0;
        for (Passenger passenger : this.getPassengers()) {
            total += maxBagsWeightForPassenger();
        }
        return total;
    }

    public int bagsWeightLeft() {
        int maxBagsWeightforFlight = maxBagsWeightForPassenger() * plane.getCapacity();
        return maxBagsWeightforFlight - maxBagsWeightForBookedPassenger();
    }

}

