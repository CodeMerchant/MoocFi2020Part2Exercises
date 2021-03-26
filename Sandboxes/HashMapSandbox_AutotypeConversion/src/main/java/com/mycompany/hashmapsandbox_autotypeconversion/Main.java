/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashmapsandbox_autotypeconversion;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        registerSightingCounter register = new registerSightingCounter();
        
        System.out.println(register.timesSighted("hi")); //should return a default of 0 since the map is empty
        
        register.addSighting("Veyron");
        
        System.out.println(register.timesSighted("Veyron")); //should return 1 since the Veyron exists in the Map and has also been sighted once
        
    }
}
