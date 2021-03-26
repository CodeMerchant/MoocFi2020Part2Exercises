/*
 A reference type variable as a HashMap value

Searching books by book title
If a book is found with the given search term, the library returns a reference to the book.
 */
package com.mycompany.hashmapfirstsandbox;

import java.util.HashMap;
import java.util.ArrayList;

public class BookDirectory {

    public static void main(String[] args) {
       /*
        //creating book objects
        Book headFirst = new Book("Head First Java", 2005, "....");
        Book pragmatic = new Book("Pragmatic Programmer", 2019, "...");

        //creating hashmap object that uses the books name as the key and the created book as a value
        HashMap<String, Book> directory = new HashMap();
        
        
        directory.put(headFirst.getName(), headFirst);
        directory.put(pragmatic.getName(), pragmatic);
        
        //trying to retrieve book by name
        Book book = directory.get("ubuntu101");
        System.out.println(book); //will return null reference since a book named Ubuntu101 doesnt exist
        System.out.println();
        /*
        will search and retrieve Head Frist Java since this book exists. 
        NB! A lower case search or a search where there's a space at the beginning of the word or at the end (eg. "head First Java" "  Head First Java")
        will return a null reference.
        We'll create a Library class to remedy this.
        */
        //book = directory.get("Head First Java"); 
        //System.out.println(book);
        
        //Using Library class
       /* Book headFirst = new Book("Head First Java", 2005, "....");
        Book pragmatic = new Book("Pragmatic Programmer", 2019, "...");
        Book heading = new Book("Heading for Greatness", 2019, "Testing");
        
        Library library = new Library();
        library.addBook(headFirst);
        library.addBook(pragmatic);
        library.addBook(heading);
        
        System.out.println(library.getBook("Head first Java"));
        System.out.println("");
        System.out.println(library.getBook(" HEAD FIRST JAVA"));
        System.out.println("");
        System.out.println(library.getBook("sense"));
        
        //searching map using only a few characters 
        System.out.println(library.getBookByPart("ead"));
        
        */
       
       //using an object as the key in order to find out who borrowed the book
       HashMap<Book, String> borrowers = new HashMap<>();
       
       Book bookObj = new Book ("Book object", 2000, "...");
       borrowers.put(bookObj, "Pete");
       borrowers.put(new Book("Test Driven Development", 1999, "...."), "Clive");
       
        System.out.println(borrowers.get(bookObj));
        System.out.println(borrowers.get(new Book("Book object", 2000, "..."))); //should return null
        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...."))); //should return null. We'll create a hashcode method in Book class to fix this
        
        
        /*
        For a class to be used as a HashMaps key, we need to define for it the following
        -the equals() method so that all equal or objects cause the comparision to return true and all false for all tests.
        -the hashCode method, so that as few objects as possible end up with the same hash value.
        
        
        NB! Netbeans can assist us in creating both equals and hashCode methods. Alt+Shift and select equals() and hashCode().
        
        */

    }
}
