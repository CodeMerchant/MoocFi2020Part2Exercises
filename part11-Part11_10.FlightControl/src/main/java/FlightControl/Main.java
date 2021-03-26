package FlightControl;

import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       FlightControl flightControl = new FlightControl();
       
       TextUI ui = new TextUI(flightControl, scan);
       ui.start();
    }
}
