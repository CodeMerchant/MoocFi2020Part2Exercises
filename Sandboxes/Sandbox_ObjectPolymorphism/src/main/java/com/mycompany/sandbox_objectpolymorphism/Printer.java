/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandbox_objectpolymorphism;

/**
 *
 * @author musa
 */
public class Printer {
    
    
    public void printManyTimes(Object object, int times){
        int i = 0;
        while(i < times){
            System.out.println(object);
            i += 1;
        }
    }
    
    /** Method for printing the characters of objects that implement the CharSequence interface.
     * Note that CharSequnce interface provides, among other things, the methods int length()
     * for getting a strings length and char charAt(int index), which retrieves a character from
     * a given index
     * 
     * @param charSequence Pass any object that implements the CharSequence interface
     */
    public void printCharacters(CharSequence charSequence){
        int i = 0;
        
        while(i < charSequence.length()){
            System.out.println(charSequence.charAt(i));
            
            i += 1;
        }
    }
    
}
