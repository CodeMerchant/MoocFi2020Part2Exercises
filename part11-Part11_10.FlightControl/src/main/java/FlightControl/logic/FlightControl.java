package FlightControl.logic; //aka Application's Logic

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author musa
 */
public class FlightControl {

    private HashMap<String, Airplane> aeroplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.aeroplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAeroplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.aeroplanes.put(ID, plane);
    }

    public void addFlight(Airplane plane, String departureID, String destinationID) {
        //adding the airport we're flying from and airport we're flying to
        //to the places map. NB! We must create a new Place object in the process
        this.places.put(departureID, new Place(departureID));
        this.places.put(destinationID, new Place(destinationID));

        //creating a new flight
        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));

        //adding the flight data to the map
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.aeroplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    //getting an individual aeroplane. NB! remember how we retrieve values using keys from a HashMap
    public Airplane getAirplane(String ID) {
        return this.aeroplanes.get(ID);
    }
}
