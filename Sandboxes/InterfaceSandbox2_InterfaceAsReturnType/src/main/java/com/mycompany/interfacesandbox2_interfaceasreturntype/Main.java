/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacesandbox2_interfaceasreturntype;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        
        Factory factory = new Factory();
        
        System.out.println(factory.produceNew()) ;
    }
}
