package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author musa
 */
public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        //first start asset control
        startAssetControl();
        System.out.println("");
        //start flight control once we exit the asset control
        startFlightControl();
        System.out.println("");
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("-------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose an action:" + "\n[1] Add an airplane"
                    + "\n[2] Add a flight" + "\n[x] Exit Airport Asset Control");
            
            
            System.out.print(">");

            String answer = scanner.nextLine();

            if (answer.equals("1")) {
                addAirplane();
            } else if (answer.equals("2")) {
                addFlight();
            } else if (answer.equalsIgnoreCase("x")) {
                break;
            }

        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        //NB! The FlightControl object has access to every package and its classes
        this.flightControl.addAeroplane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();

        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();

        System.out.print("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(plane, departureID, destinationID);

    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose an action:\n[1] Print airplanes"
                    + "\n[2] Print flights\n[3] Print airplane details"
                    + "\n[x] Quit");
            System.out.print(">");

            String answer = scanner.nextLine();

            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equalsIgnoreCase("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {

        flightControl.getAirplanes().forEach((plane) -> {
            System.out.println(plane);
        });
    }

    private void printAirplaneDetails() {

        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println("");

    }

    private void printFlights() {
        flightControl.getFlights().forEach((flight) -> {
            System.out.println(flight);
            System.out.println("");
        });
    }

    private Airplane askForAirplane() {
        Airplane plane = null;

        while (plane == null) {
            String id = scanner.nextLine();
            plane = flightControl.getAirplane(id);

            if (plane == null) {
                System.out.println("No airplane with the id " + id);
            }
        }

        return plane;
    }
}
