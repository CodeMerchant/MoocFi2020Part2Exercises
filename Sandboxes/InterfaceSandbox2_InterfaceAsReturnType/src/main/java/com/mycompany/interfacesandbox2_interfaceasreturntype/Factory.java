/*
 * Interfaces can be used as return types in methods. In this example
 * We create a Factory class that can be asked to construct different objects that
 * implement the Packable interface
 */
package com.mycompany.interfacesandbox2_interfaceasreturntype;

import java.util.Random;

/**
 *
 * @author musa
 */
public class Factory {

    public Packable produceNew(){
        //The Random object used here can be used to draw a random number
        Random ticket = new Random();
        
        //Draws a number from the range [0,4]. The number will be either 0, 1, 2 or 3.
        int number = ticket.nextInt(4);
        
        //This if statement is good but I'll use a switch statement as its faster. 
        /*
        if (number == 0) {
        return new CD("Kanye West", "Graduation", 2007);
        } else if (number == 1){
        return new CD("Frank Ocean", "Channel Orange", 2012);
        } else if (number == 2){
        return new Book("Robert Martin", "Clean Code", 1);
        } else if (number == 3){
        return new Book("Kent Beck", "Test Driven Development", 0.7);
        } else {
        return new ChocolateBar();
        }
         */
        
        //faster 
        switch (number) {
            case 0:
                return new CD("Kanye West", "Graduation", 2007);
            case 1:
                return new CD("Frank Ocean", "Channel Orange", 2012);
            case 2:
                return new Book("Robert Martin", "Clean Code", 1);
            case 3:
                return new Book("Kent Beck", "Test Driven Development", 0.7);
            default:
                return new ChocolateBar();
        }
        
    }
    
}
