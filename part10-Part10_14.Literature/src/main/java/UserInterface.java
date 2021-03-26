
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author musa
 */
public class UserInterface {

    private Scanner scan;
    private List<Book> books;

    public UserInterface(Scanner scan, List<Book> books) {
        this.scan = scan;
        this.books = books;
    }

    public void start() {

        read();
        printSize();
        print();

    }

    public void read() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = this.scan.nextLine();

            if (bookName.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(this.scan.nextLine());
            System.out.println("");

            this.books.add(new Book(bookName, age));
        }
    }

    public void printSize() {
        //System.out.println(this.books.size() + " books in total."); //also works

        long numOfBooks = this.books.stream()
                .count();
        System.out.println(numOfBooks + " books in total.");
        System.out.println("");
    }

    public void print() {
        System.out.println("Books:");
        
        //Part 1: Printing the books
        // this.books.forEach((book) -> {
        //     System.out.println(book);
        // });

        //Part 2: Ordering books based on their age recommendation
        // Collections.sort(this.books, (book1, book2) -> book1.getAgeRecommendation() - book2.getAgeRecommendation());
        // this.books.stream()
        //       .forEach(book -> System.out.println(book));
       
        //Part 3: Ordering books based on their age recommendation and name
        Comparator<Book> compare = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getNameOfBook);

        Collections.sort(this.books, compare);

        this.books.forEach((book) -> {
            System.out.println(book);
        });

    }
}
