/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacesandbox_javabuiltininterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {

        //The List interface.
        /*
        The list interface defines the basic functionality related to lists. Because
        the ArrayList class implements the 'List' interface, we can also
        use it  through the b'List' interface
         */
        //ArrayList via List interface
        List<String> myNames = new ArrayList<>();
        myNames.add("Candice");
        myNames.add("Riola");
        myNames.add("Stacey");

        System.out.println(returnListSize(myNames));
        System.out.println("");
        
        System.out.println("Map example");
        System.out.println("");

        //HashMap via Map interface
        Map<String, String> maps = new HashMap<>();
        maps.put("CR7", "Cristiano Ronaldo");
        maps.put("Wazza", "Wayne Rooney");
        maps.put("RVP", "Robin van Persie");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }

        //returning the size of the map
        System.out.println("size of map: " + returnMapSize(maps));
        
        System.out.println("");
        System.out.println("Set example");
        System.out.println("");

        /*
        The Set interface
        The Set interface describes functionality related to sets. In Java, Sets always contain either 0 or 1 amounts
        of any given object. As an example, we will implement the set interface using a HashSet. We will go through
        the elements of the set.
         */
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        //Note how the HashSet in no way assumes the order of a set of elements. If objects created from 
        //custom classes are added to the HashSet object, they MUST have both the equals() and hashCode()
        //methods defined.
        for (String element : set) {
            System.out.println(element);
        }
        System.out.println("");
        System.out.println("Collections example");
        System.out.println("");

        /*
        The Collection interface
        The Collection interface describes functionality related to to collections.
        Among other things, lists and sets are categorised as collections in Java 
        (NB! Both the List and Set interfaces implement the Collection interface).
        The Collection interface provides, for instance, methods for checking the existence
        of an item (the method 'contains()') and determinig the size of a collection (the method 'size()')
         
        The Collection interface also determines how the collection is iterated over. Any
        class that implements the Collection interface, either directly or indirectly,
        inherits the functionality required for a for-each loop.
        
        Below we will iterate over a Hash table's keys and values
        
        */
        Map<String, String> translations = new HashMap<>();
        translations.put("kyk", "look");
        translations.put("wunderbar", "wonderful");
        
        Set<String> keys = translations.keySet();
        
        //Use our Collections interface
        Collection<String> keyCollection = keys;
        System.out.println("Keys:");
        for (String key : keyCollection) {
            System.out.println(key);
        }
        System.out.println();
        System.out.println("Values:");
        
        Collection<String> values = translations.values();
        
        for (String value : values) {
            System.out.println(value);
        }
        
    }
    //List as a method parameter
    public static int returnListSize(List<String> list) {
        return list.size();
    }

    //Map as a method parameter
    public static int returnMapSize(Map<String, String> map) {
        return map.size();
    }

}
