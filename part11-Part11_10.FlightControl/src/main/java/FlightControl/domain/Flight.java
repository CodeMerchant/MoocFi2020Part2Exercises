/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author musa
 */
public class Flight {

    private Airplane plane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane plane, Place departureAirport, Place targetAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getPlane() {
        return plane;
    }

    public Place getDepartureAirport() {
        return departureAirport;
    }

    public Place getTargetAirport() {
        return targetAirport;
    }

    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departureAirport + "-"
                + this.targetAirport + ")";
    }
}
