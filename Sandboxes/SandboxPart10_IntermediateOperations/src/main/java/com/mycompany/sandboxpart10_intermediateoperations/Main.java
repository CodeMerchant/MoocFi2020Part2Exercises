/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_intermediateoperations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        //Problem 1: We recieve a list of persons. Print the number of Persons born before 1970
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Smith", 1967));
        persons.add(new Person("Sean", "Penn", 1969));
        persons.add(new Person("Jadon", "Sancho", 2001));
        persons.add(new Person("Cristiano", "Ronaldo", 1984));
        persons.add(new Person("Cristiano", "Ronaldo", 1984));//used to test problem 3. Cristiano should be printed once
        persons.add(new Person("Alfie", "Mawson", 1994));

        //printing number of persons born before 1970
        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);

        System.out.println("");
        //Problem 2. How many persons' first names start with the letter "A"
        long count2 = persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println("Number of persons whose names start with the letter \"A\": " + count2);

        //Problem 3: Print the number of unique first names in alphabetical order
        /*
        1. We'll first use the map method to change a stream containing person objects into a stream
        containing first names.
        2. We call the distinct method, which will return a stream that only contains unique values
        3. We call the sorted method, which will sort the strings
        4. We call the ForEach method to help print out the strings
       
        NB! The distinct method uses the equals method that is in all objects for comparing
        whether two strings are the same. The sorted method is able to sort objects that contain some
        kind of order e.g. numbers and strings
         */
        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));

        //Objects and Stream. see Book class
        /**
         * Lets say we want to calculate the average of the authors' birth years in a list of books.
         * We can do this using stream methods in a way that feels natural. We:
         * 1. Convert the stream of books to a stream of persons
         * 2. Convert the stream of person to a stream of birth years
         * 3. We ask the Integer stream for an average
         * 4. Convert the average into a double value
         */
        
        
        List<Book> books = new ArrayList<>();
        books.add(new Book((new Person("Kano", "Aurelio", 1997)), "Skating101", 2018));
        books.add(new Book((new Person("Brett", "Hart", 1969)), "Necks101", 2003));
        books.add(new Book((new Person("Pablo", "Escobar", 1949)), "The Life Of Pablo", 1992));
        books.add(new Book((new Person("Joaquin", "Guzman", 1957)), "The Great Narco Escape", 2016));
        
        
        double average = books.stream()
                .map(book -> book.getAuthor()) //step 1
                .mapToInt(author -> author.getBirthYear()) //step 2
                .average() //step 3
                .getAsDouble(); //step 4
                
        
        System.out.println("Average of the authors birth years: " + average);
        
        //NB! Step 1 and 2 could be done in a single map call
        //double average = books.stream().
        //  .mapToInt(book -> book.getAuthor().getBirthYear())
        
        //Getting the names of all the authors whose books have the word "The" in their titles
        books.stream()
                .filter(book -> book.getName().contains("The"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));
        
        
        //We can also use streams to build more complex string represenatations.
        //Below we print "author's name : book name in alphabetical order
        
        books.stream()
                .map(book -> book.getAuthor().getFirstName() +  ": " + book.getName())
                .sorted()
                .forEach(name -> System.out.println(name));
                 
    }
}
