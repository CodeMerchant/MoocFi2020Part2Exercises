/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandbox_objectpolymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        String string = "o";
        
        List<String> words = new ArrayList<>();
        
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");
        
        printer.printManyTimes(words, 3);
        
        printer.printManyTimes(string, 2);
        
        //print charsequence method
        String newString = "String object implements CharSequence interface";
        printer.printCharacters(newString);
    }
}
