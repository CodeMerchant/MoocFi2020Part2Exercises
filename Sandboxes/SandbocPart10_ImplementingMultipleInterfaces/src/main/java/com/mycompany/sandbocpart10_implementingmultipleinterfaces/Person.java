/*
 * We want to create a Person who is both identifiable and sortable.
 * We can do this by implementing both Comparable and Identifiable interfaces.
 * 
 */
package com.mycompany.sandbocpart10_implementingmultipleinterfaces;

/**
 *
 * @author musa
 */
public class Person implements Identifiable, Comparable<Person> {
    private String name;
    private String socialSecurityNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return this.socialSecurityNumber;
    }

    @Override
    public int compareTo(Person comparedPerson) {
        return this.getId().compareTo(comparedPerson.getId()); //we use the compareTo because social number is a string 
    }
    
    
}
