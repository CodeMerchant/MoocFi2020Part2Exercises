package com.mycompany.hashmapfirstsandbox;

import java.util.HashMap;
import java.util.ArrayList;

public class Library {

    private HashMap<String, Book> directory;
    

    public Library() {
        this.directory = new HashMap<>();
        
    }

    /**
     * Method that adds Book object to HashMap Allows for minor misspellings to
     * take place such as capitalised or lower-cased strings, or ones with with
     * spaces at the beginning and/or end. The key (book title) is converted to
     * lowercase and spaces at beginning and end are removed using
     * sanitizedString helper method
     *
     * @param book takes a book object as a parameter
     */
    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        //first search if book already exists using containsKey method
        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library");
        } else {
            this.directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot remove book that does not exist.");
        }
    }
    
    /**
     * Method that helps us go through a HashMap's keys by searching using a part of a keys name/id.
     * e.g. A search for "ea" would return all the book objects that have "ea" in their key.
     * @param titlePart the key to search for and print
     * @return a list of all the Book objects stored in the HashMap
     */
    public ArrayList<Book> getBookByPart(String titlePart){
        titlePart = sanitizedString(titlePart);
        
        ArrayList<Book> books = new ArrayList<>();
        
        for(String bookTitle : this.directory.keySet()){
            if(!bookTitle.contains(titlePart)){
                continue;
            }
            
            books.add(this.directory.get(bookTitle));
        }
        return books;
    }

    //using this method since many methods will need make use of a sanitised key
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        /*conversion to lowercase and then returning the converted string (toLowerCase)
          where spaces at beginning and end are removed
         */
        string = string.toLowerCase();
        return string.trim();
    }
}
