/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashmapAlternative;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        Hashmap<Integer, Integer> map = new Hashmap<>();

        map.put(21, 12);
        map.put(25, 121);
        map.put(30, 151);
        map.put(33, 15);
        map.put(35, 89);

        System.out.println("Value corresponding to key 21: " + map.get(21));
        System.out.println("Value corresponding to key 51: " + map.get(51));

        System.out.print("Displaying hashmap key value pairs:");
        map.display();

        System.out.println("Value corresponding to 21 removed?: " + map.remove(21));
        System.out.println("Value corresponding to 51 removed?: " + map.remove(51));

    }
}
