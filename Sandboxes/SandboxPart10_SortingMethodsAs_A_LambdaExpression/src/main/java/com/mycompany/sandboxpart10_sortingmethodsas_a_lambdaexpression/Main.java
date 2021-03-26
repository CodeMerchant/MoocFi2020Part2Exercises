/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_sortingmethodsas_a_lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Ada Lovelace", 1815));
        person.add(new Person("Irma Wyman", 1928));
        person.add(new Person("Grace Hooper", 1906));
        person.add(new Person("Mary Coombs", 1929));

        //We want to sort the list without having to implement the Comparable interface
        /**
         * Both the Collections.sort() and the streams sorted() method accept a
         * lambda expression as a parameter that defines the sorting criteria.
         * More specifically, both methods can be provided with an object that
         * implements the Comparator interface, which defines the desired order.
         * - the lambda expression is used to create this object.
         */
        //using the sorted() method
        person.stream()
                .sorted((p1, p2) -> {
                    return p1.getBirthYear() - p2.getBirthYear();
                }).forEach(p -> System.out.println(p.getName()));

        System.out.println();

        //printing out the unsorted list
        person.stream()
                .forEach(p -> System.out.println(p.getName()));

        System.out.println();

        //using sort() method from Collections class
        Collections.sort(person, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        person.stream()
                .forEach(p -> System.out.println(p.getName()));

        
        System.out.println("");
        System.out.println("using compareTo()");
        
        //When comparing strngs, remember that we can use the compareTo method provided by the string class.
        List<Person> topManagers = new ArrayList<>();
        topManagers.add(new Person("Jose Mourinho", 1963));
        topManagers.add(new Person("Arsene Wenger", 1949));
        topManagers.add(new Person("Alex Ferguson", 1941));
        topManagers.add(new Person("Pep Guardiola", 1971));
        topManagers.add(new Person("Jurgen Klopp", 1972));

        topManagers.stream()
                .sorted((p1, p2) -> {
                    return p1.getName().compareTo(p2.getName());
                }).forEach(p -> System.out.println(p.getName()));

    }
}
