
import java.util.ArrayList;
import java.util.List;


public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
      Employees university = new Employees();
      
      university.add(new Person("Petrus", Education.PHD));
      university.add(new Person("Arto", Education.HS));
      university.add(new Person("Elina", Education.PHD));
      
      university.print();
      
      university.fire(Education.HS);
      
        System.out.println("==");
        university.print();
        
       List<Person> person = new ArrayList<>();
       person.add(new Person("Colin", Education.MA));
       person.add(new Person("Solly", Education.BA));
       
       university.add(person);
       
        System.out.println("==");
        university.print();
       
    }
}
