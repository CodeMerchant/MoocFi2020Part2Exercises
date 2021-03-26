
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgram {
    
    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mary"));
        students.add(new Student("Ragnar"));
        students.add(new Student("Jose"));
        students.add(new Student("Avram"));
        students.add(new Student("Federico"));
        
        Collections.sort(students);
        
        students.stream()
                .forEach(student -> System.out.println(student));
    }
}
