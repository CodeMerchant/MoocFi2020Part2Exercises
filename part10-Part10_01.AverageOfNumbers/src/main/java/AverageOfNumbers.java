
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String numbersAsString = scanner.nextLine();

            if (numbersAsString.equalsIgnoreCase("end")) {
                break;
            }

            input.add(numbersAsString);
        }

        double averageOfNumbers = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("average of numbers: " + averageOfNumbers);

    }
}
