package com.mycompany.interfacesandbox1_readable;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        //Objects can be instantiated from classes that implement interfaces just like with normal classes.
        //They're also used in the same way. An example is presented below

        //example1
        TextMessage message = new TextMessage("Jay Z", "The Roc is in the building");
        System.out.println(message.read());
        System.out.println("");

        //example2
        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("Jay Z", "The Roc is in the building"));

        for (TextMessage textMessage1 : textMessage) {
            System.out.println(textMessage1.read());
        }

        System.out.println("");

        //Creating a list object to populate our pages
        ArrayList<String> pages = new ArrayList<>();

        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the ui logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice!. Try out different things for yourself and work on your own projects.");

        //creating Ebook object and passing the pages list to the constructor
        //We can also use this method to create a new ebook using (I prefer this method):
        //Readable book = new Ebook("Tips for programming", pages);
        Ebook book = new Ebook("Tips for programming", pages);

        int page = 0;

        while (page < book.pages()) {
            System.out.println(book.read());
            page += 1;
        }

        System.out.println("");

        //We can also create a list that contains objects (i.e TextMessages and Ebooks) of the interfaces type:
        ArrayList<Readable> readingList = new ArrayList<>();

        //first adding TextMessage objects to our Readable list
        readingList.add(new TextMessage("Frank", "Every day patches the night up"));
        readingList.add(new TextMessage("Future", "100 thousand for the cheapest ring"));

        //creating list for our pages and adding to it
        ArrayList<String> pages2 = new ArrayList<>();
        pages2.add("Super rich kids with nothing but fake friends");

        //adding a new Ebook to our Readable list
        readingList.add(new Ebook("Channel Orange liner notes", pages2));

        //iterating through our Readable list, calling the read method at every iteration
        for (Readable readable : readingList) {
            System.out.println(readable.read());
        }
        System.out.println("");
        //Interfaces as Method parameters (see Printer class)

        /*
        The true benefits of interfaces are reaped when they are used as the type of
        parameter provided to a method. Since we already know that an interface can be
        used as a variable type, this means it can also be used a parameter typer in method calls.
        
        The value of method print in the Printer class lies in the fact it can be used by ANY class that 
        implements the Readable interface as a parameter. An example is seen below
        
         */
        TextMessage message2 = new TextMessage("Vlad Putin", "Presidency 101 is now available");
        ArrayList<String> pages3 = new ArrayList<>();

        pages3.add("To Kremlin or not to Kremlin");
        Ebook book1 = new Ebook("How to be an effective leader", pages3);

        //Here's where the fun starts
        Printer printer = new Printer();
        printer.print(message2); //prints because TextMessage implements Readable interface
        printer.print(book1); //also prints because Ebook implements Readable interface

        System.out.println("");
        System.out.println("___________________________");
        System.out.println("");

        /*
        We'll next create a ReadingList class that has an ArrayList instance variable
        where we add the things to be read. We will make use of an add() which will recieve
        a Readable type object as a parameter. See ReadingList class
         */
        ReadingList swaysList = new ReadingList();
        swaysList.add(new TextMessage("Kanye", "It aint Ralph though!..."));
        swaysList.add(new TextMessage("Kanye", "It aint Ralph level!"));

        System.out.println("Sway, you have " + swaysList.toRead() + " text messages that are unread");

        //Since ReadingList is of type Readable, we can add ReadingList objects to the reading list.
        //Lets give Kendrick 1000 messages to read. Kendrick is a busy man so we'll tell his PA to read them
        //for him
        ReadingList kendricksList = new ReadingList();

        int i = 0;
        while (i < 1000) {
            kendricksList.add(new TextMessage("Kanye", "Let's make a collaborative album together"));
            i += 1;
        }

        System.out.println("Kendrick, you have " + kendricksList.toRead() + " text messages from Kanye that are unread.");
        System.out.println("Kendrick: 'Those are too many messages, I'll let my PA read them' ");

        System.out.println("...nicole reads on behalf of kendrick");

        //creating PA's list
        ReadingList nicolesList = new ReadingList();
        //adding Kendricks list object to nicoles list.
        nicolesList.add(kendricksList);
        System.out.println("Nicole, you have " + nicolesList.toRead() + " text message object(s) in your list"); //will output 1. Would be 2 if we also added SwaysList

        //Nicole reads all the messages on kendricks behalf.  NB! remember what happens whenever a list is read. Hint: check ReadingList class
        nicolesList.read();

        System.out.println("");
        System.out.println("Kendrick, you now have " + kendricksList.toRead() + " text messages from Kanye that are unread");
        System.out.println("Nicole, you have " + nicolesList.toRead() + " text message object(s) in your list"); //will output 0.
        /*
        The read method called on Nicole's list goes through all the Readable objects and calls the read method on them.
        When the read method was called by Nicole, the method also went through Kendrick's list thats included in Nicole's. 
        Kendrick's list is run through by calling its read method. At the end of each read method call, the list is cleared.
        In this way, Kendrick's list empties when Nicole reads it.
         */
    }
}
