/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_firstgenericsexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        Locker<String> string = new Locker<>();
        string.setValue(":)");

        System.out.println(string.getValue());

        Locker<Integer> integer = new Locker<>();
        integer.setValue(7);

        System.out.println(integer.getValue());

        Locker<Random> randomObj = new Locker<>();
        randomObj.setValue(new Random());
        System.out.println(randomObj.getValue().nextInt(4));

        /* There is no maximum on the number of type params, its all dependant on
        the implementation. The programmer could implement the following Pair class that is able
        able to store two objects of specified types. See Pair class
         * 
         */
        Pair<String, Integer> inventory = new Pair<>();
        HashMap<String, Integer> map1 = new HashMap<>();

        inventory.setValues("XboxSeriesX", 5);

        map1.put(inventory.getFirst(), inventory.getSecond());

        map1.entrySet().stream()
                .filter((entry) -> (entry.getKey().equals(inventory.getFirst())))
                .forEachOrdered((entry) -> {
                    System.out.println("Inventory Item: " + entry.getKey() + "\nStock available: " + entry.getValue());
                });

        Pair<String, Integer> i1 = new Pair("Pow", 3);
        Pair<Object, Object> i2 = new Pair("Hi", i1);

        System.out.println(i1);
        System.out.println(i2);

        //Lets create a Generic Interface. See List class
    }

}
