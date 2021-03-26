
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.scan = scan;
        this.list = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scan.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            promptCommand(command);
        }
    }

    public void promptCommand(String command) {
        if (command.equalsIgnoreCase("add")) {
            add();
        } else if (command.equalsIgnoreCase("list")) {
            list();
        } else if (command.equalsIgnoreCase("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String addTodo = this.scan.nextLine();
        this.list.add(addTodo);
    }

    public void list() {
        this.list.print();;
    }

    public void remove() {
        System.out.print("which one is removed? ");
        int removeItem = Integer.valueOf(this.scan.nextLine());
        this.list.remove(removeItem);
    }
}
