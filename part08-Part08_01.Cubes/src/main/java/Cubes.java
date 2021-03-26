
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String getText = scan.nextLine();

            if (getText.equalsIgnoreCase("end")) {
                break;
            }
            int num = Integer.valueOf(getText);
            int cube = num * num * num;
            System.out.println(cube);
        }
    }
}
