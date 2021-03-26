
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        
        Hideout<String> den = new Hideout<>();
        
        System.out.println(den.isInHideout());
        den.putIntoHideout("Antonio");
        
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        
        System.out.println(den.isInHideout());
        den.putIntoHideout("Merisa");
        
        den.putIntoHideout("Candice");
        System.out.println(den.isInHideout());
        
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());

    }
}
