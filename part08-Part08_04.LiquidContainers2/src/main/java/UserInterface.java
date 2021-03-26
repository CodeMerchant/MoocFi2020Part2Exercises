
import java.util.Scanner;

public class UserInterface {

    private Container c1;
    private Container c2;

    private Scanner scan;

    public UserInterface(Container one, Container two, Scanner scan) {
        this.c1 = one;
        this.c2 = two;
        this.scan = scan;
    }

    public void start() {
        System.out.println("First: " + this.c1.toString());
        System.out.println("Second: " + this.c2.toString());

        while (true) {
            String input = this.scan.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amountOfLiquid = Integer.valueOf(parts[1]);

            processCommand(command, amountOfLiquid);

            System.out.println("First: " + this.c1.toString());
            System.out.println("Second: " + this.c2.toString());

        }
    }

    public void processCommand(String command, int amountOfLiquid) {
        if (command.equalsIgnoreCase("add")) {
            add(amountOfLiquid);
        } else if (command.equalsIgnoreCase("move")) {
            move(amountOfLiquid);
        } else if (command.equalsIgnoreCase("remove")) {
            remove(amountOfLiquid);
        }
    }

    public void add(int amount) {
        this.c1.add(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.c1.contains()) {
                this.c2.add(this.c1.contains());
                this.c1.remove(amount);
            } else {
                this.c1.remove(amount);
                this.c2.add(amount);
            }

        }
    }

    public void remove(int amount) {
        this.c2.remove(amount);
    }
}
