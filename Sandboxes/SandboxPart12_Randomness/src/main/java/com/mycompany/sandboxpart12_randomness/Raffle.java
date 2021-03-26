/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart12_randomness;

import java.util.Random;

/**
 *
 * @author musa
 */
public class Raffle {
    public static void main(String[] args) {
        Random ladyLuck = new Random(); //creat Random object ladyluck
        
        for(int i = 0; i < 4; i++){
            
            //drawing random number and printing it
            int randomNumber =  ladyLuck.nextInt(10); //this will print numbers between 0 and 9
            System.out.println(randomNumber);
        }
        
        /*
        We can use the nextInt method to create a diverse randomness. For example,
        we might need a program to give us a temperature between[-30, 50]. We
        can do this by first creating a random number between 0 and 80, and then
        subtracting 30 from it.
        */
        
        Random weatherMan = new Random();
        int temperature = weatherMan.nextInt(81) -30; //i.e whatever value nextInt returns, we subtract it by 30
        System.out.println(temperature);
    }
}
