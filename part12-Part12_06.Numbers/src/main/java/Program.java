
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many number should be printed?");
        
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            printRandomNumbers(num);
            break;
            
           
        }
        
    }

    public static void printRandomNumbers(int numbers) {
        Random lotto = new Random();

        for (int i = 0; i < numbers; i++) {
            int randomNum = lotto.nextInt(11);
            System.out.println(randomNum);
        }
    }
}
