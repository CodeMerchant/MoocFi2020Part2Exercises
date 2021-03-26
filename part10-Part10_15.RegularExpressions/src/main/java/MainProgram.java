
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scan = new Scanner(System.in);
        Checker check = new Checker();
        
        UserInterface ui = new UserInterface(scan, check);
        ui.start();
    }
}
