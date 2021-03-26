
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();

        System.out.println("enter:");
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == 0) {
                break;
            }

            list.add(numbers);
        }

        System.out.println(positive(list));

    }

    public static List<Integer> positive(List<Integer> numbers) {
        //using ArrayList::new
        ArrayList<Integer> values = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        //using toList()
        List<Integer> usingToList = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        return usingToList;
    }
}
