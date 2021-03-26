
/**
 * Write a program that reads the user's input as strings. When the user inputs an empty string(presses enter),
 * the input reading will be stopped and the program will print all the user inputs.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            list.add(userInput);
        }

        list.stream()
                .forEach(word -> System.out.println(word));
    }
}
