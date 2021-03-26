
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        System.out.println("First: " + firstContainer + "/100");
        System.out.println("Second: " + secondContainer + "/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amountOfLiquid = Integer.valueOf(parts[1]);

            if (command.equalsIgnoreCase("add")) {
                if (amountOfLiquid > 0) {
                    firstContainer += amountOfLiquid;
                }

                if (firstContainer > 100) {
                    firstContainer = 100;
                }
                System.out.println("First: " + firstContainer + "/100");
                System.out.println("Second: " + secondContainer + "/100");
            }

            //moving liquid
            if (command.equalsIgnoreCase("move")) {
                if (amountOfLiquid > 0) {

                    if (amountOfLiquid > firstContainer) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else {
                        firstContainer -= amountOfLiquid;
                        secondContainer += amountOfLiquid;
                    }
                }

                if (secondContainer > 100) {
                    secondContainer = 100;
                }
                System.out.println("First: " + firstContainer + "/100");
                System.out.println("Second: " + secondContainer + "/100");
            }
            if (command.equalsIgnoreCase("remove")) {
                if (!(secondContainer < 0)) {
                    secondContainer -= amountOfLiquid;
                }

                if (secondContainer < 0) {
                    secondContainer = 0;
                }
                System.out.println("First: " + firstContainer + "/100");
                System.out.println("Second: " + secondContainer + "/100");
            }

        }

    }

}
