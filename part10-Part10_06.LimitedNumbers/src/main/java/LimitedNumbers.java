/**
 * Write a program that reads user input. When the user gives a negative number as input, the input reading is stopped.
 * After this, print all the numbers the user has given that are between 1 and 5
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList= new ArrayList<>();
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput < 0){
                break;
            }
            
            numbersList.add(userInput);
        }
        
        numbersList.stream()
                .filter(values -> values > 0 && values <= 5)
                //.collect(Collectors.toList()) not needed
                .forEach(number -> System.out.println(number));
    }
}
