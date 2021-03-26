/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_sortingmethodsas_a_lambdaexpression;

/**
 *
 * @author musa
 */
public class Person {
    private int birthYear;
    private String name;

    public Person(String name,int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }
    
    
}
