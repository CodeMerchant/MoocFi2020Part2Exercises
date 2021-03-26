/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_enumeratedtype_enum;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        /**
         * If we know the possible return values of a variable in advance, we
         * can use a class of type 'enum' (enumerated type) to represent the
         * values. Enumerated types are their own type in addition to being
         * normal classes and interfaces. For example, we will create a Suit
         * enum class that defines four constant values: Diamond, Spade, Club
         * and Heart. See Suit.java
         *
         *
         * In it's simplest form, 'enum' lists the constant values it declares,
         * separated by a comma. Enum types, i.e., constants, are conventionally
         * written in capitals.
         *
         * An Enum is (usually) written in its own file, much like a class or
         * interface. We will create a class called Card, where the suit is
         * represented by an enum. See Card class
         */

        //Lets use the card
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        if (first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }

        /**
         * Notice we compare two enums with ==. How is this possible?
         *
         * Well, each enum field gets a unique number code which is why we can
         * compare them using the == sign. Just as other classes in Java, these
         * values also inherit the Object class and its equals method. The
         * equals method compares this numeric identifier in enum types too.
         *
         * The numeric identifier of an enum field value can be found with an
         * ordinal() method. This method actually returns an order number - if
         * the enum value is presented first, its order number is 0. If its
         * second, the order number will be 1, and so on.
         *
         * Lets test it out
         */
        System.out.println("Diamond order number: " + Suit.DIAMOND.ordinal());
        System.out.println("Hearts order number: " + Suit.HEART.ordinal());

        /**
         * Object References in Enum Enumerated types may contain object
         * reference variables. The values of the reference variables should be
         * set in an internal constructor of the class defining the enumerated
         * type, i.e., within a constructor having a private access modifier.
         * Enum type classes CANNOT have a public constructor. See Color.java
         *
         *
         * Lets use the Color class
         */
        System.out.println(Color.GREEN.getCode()); //returns the color code of green
        
        /**
         * Iterator
         * 
         * Lets look at a Hand class that represents the set of cards that a player is holding. See Hand.java
         */
        
        

    }

}
