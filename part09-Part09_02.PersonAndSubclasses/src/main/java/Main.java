
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        /*
        Person ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Person esco = new Teacher("DJ Esco", "12 Morsey St. Atlanta, Georgia", 5400);

        System.out.println(ada);
        System.out.println(esco);

        Student ollie = new Student("Ollie", "6831 Hollywood Blvd. Los Angeles 90028");
       
        int i = 0;
        while(i < 25){
            ollie.study();
            
            i+=1;
        }
        System.out.println(ollie);
         */

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6831 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
