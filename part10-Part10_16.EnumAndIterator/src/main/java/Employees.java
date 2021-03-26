
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author musa
 */
public class Employees {

    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {        
        Iterator<Person> addListIterator = peopleToAdd.iterator();
        
        addListIterator.forEachRemaining(person -> this.persons.add(person));
        
    }

    public void print() {
        Iterator<Person> employeeIterator = this.persons.iterator();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
        
        //alternatively
       // employeeIterator.forEachRemaining(employee -> System.out.println(employee));
    }

    public void print(Education education) {
        Iterator<Person> employeeIterator = this.persons.iterator();

        while (employeeIterator.hasNext()) {
            Person nextEmployee = employeeIterator.next();
            
            if (nextEmployee.getEducation() == education) {
                System.out.println(nextEmployee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> employeeIterator = this.persons.iterator();

        while (employeeIterator.hasNext()) {
            
            if (employeeIterator.next().getEducation() == education) {
                employeeIterator.remove();
            }
        }
    }
}
