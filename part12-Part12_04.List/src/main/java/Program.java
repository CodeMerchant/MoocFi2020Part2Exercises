
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<Integer> integerList = new List<>();
        System.out.println(integerList.contains(1));
        
        integerList.add(1);
        System.out.println(integerList.contains(1));
        
        integerList.add(3);
        //finding the index of given value
        //int index = integerList.indexOfValue(2); //should return ArrayIndexOutOfBounds since the value 2 isn't in List
        //System.out.println(integerList.value(index));
        
        int index1 = integerList.indexOfValue(3);
        System.out.println(index1); //returns the index of value 3
        System.out.println(integerList.value(index1)); //returns the value since it exists in the List
        
        integerList.remove(1); //removing the value 1
        System.out.println(integerList.contains(1)); //checking if the value 1 is in the list
        
        integerList.add(34);
        integerList.add(77);
        
        //going through all elements in the list and printing them
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.value(i));
        }
    }
    
}
