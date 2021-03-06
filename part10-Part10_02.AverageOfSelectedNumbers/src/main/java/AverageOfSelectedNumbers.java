
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("end")) {
                break;
            }

            input.add(userInput);
        }

        double averageOfPositiveNums = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        double averageOfNegativeNums = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String ch = scanner.nextLine();
        if (ch.equalsIgnoreCase("p")) {
            System.out.println("Average of positive numbers: " + averageOfPositiveNums);
        } else if (ch.equalsIgnoreCase("n")) {
            System.out.println("Average of negative numbers: " + averageOfNegativeNums);
        }

    }
}
