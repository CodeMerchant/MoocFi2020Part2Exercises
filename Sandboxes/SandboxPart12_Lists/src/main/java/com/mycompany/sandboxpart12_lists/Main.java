/*
 * Lists
 * Lets examine one way to implement the java ArrayList data structure.
 * Java ArrayList uses an array. The type of the elements in the array is defined
 * by the type of parameter given to the ArrayList. Due to this, we can add nearly any
 * type of data to a list. Java List offers multiple methods, but right now,
 * add, contains, remove and get are most relevant to us.
 */
package com.mycompany.sandboxpart12_lists;

import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        // System.out.println(strings.contains("hi"));
        //strings.add("hi");
        // System.out.println(strings.contains("hi"));
        // strings.remove("hi");
        // System.out.println(strings.contains("hi"));

        /*
         *Creating a new list 
         * See List class.
         * The List has a generic array - the type of the elements in the array
         * will be defined on run time using type parameters.
         * We will set the size of the array to 10. The array is created as a type object
         * and changed to type generic with (A[]) new Object[10]; - this is due to Java
         * not supporting the call 'new A[10]' for now.
         */
        //Lets implement the List class by adding to it 
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("world");

        /**
         * Lets implement a method grow() which will allow us to increase the
         * list since its currently not possible to add to the original list
         * once it gets full. See grow() method in List class
         */
        System.out.println(myList.contains("Hello"));
        System.out.println(myList.contains("Wereld"));
        myList.add("Wereld");
        System.out.println(myList.contains("Wereld"));
    }
}
