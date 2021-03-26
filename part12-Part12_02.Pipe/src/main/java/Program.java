
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        Pipe<String> pipe = new Pipe<>();

        pipe.putIntoPipe("A");
        pipe.putIntoPipe("B");
        pipe.putIntoPipe("C");
        pipe.putIntoPipe("D");

        while (pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }

        Pipe<Integer> numberPipe = new Pipe<>();

        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while (numberPipe.isInPipe()) {
            sum += numberPipe.takeFromPipe();
        }

        System.out.println(sum);
        System.out.println(numberPipe.isInPipe());

        //Quiz: Why doesn't the program work?
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        //int num = strings.get(0);

        //fix:
        int num = Integer.parseInt(strings.get(0));
        System.out.println(num);

        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 3;
        numbers[2] = 2;
        numbers[3] = 1;
        numbers[1] = numbers[2] * numbers[3];
        numbers[2] = 4;

        int sumOfNumberArray = 0;
        for (int number : numbers) {
            System.out.println(number);
            sumOfNumberArray += number;

        }
        double average = (double) sumOfNumberArray / numbers.length;
        System.out.println("Average of numbers in array is: " + average);

    }
}
