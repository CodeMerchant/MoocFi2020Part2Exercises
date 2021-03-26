
public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student comparedStudent) {
        return this.name.compareToIgnoreCase(comparedStudent.getName()); //read the Comparable javadoc if you don't understand what has happened here or how I got this

    }
}
