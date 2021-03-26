
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        Hashmap<Integer,String> cars = new Hashmap<>();
        
        cars.add(1, "Toyota CH-R");
        cars.add(2, "Nissan Juke");
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        cars.add(2, "Audio TT");
        System.out.println(cars.get(2));
        cars.add(3, "VW Polo");
        cars.remove(1);
        
        System.out.println(cars.get(1));
        
       
        cars.add(1, "Dodge Challenger");
        cars.add(4, "Nissan GT-R");
        cars.add(5, "Kia Picanto");
        
    
    }

}
