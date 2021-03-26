/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("Mikael", 182));
        member.add(new Member("Caleb", 187));
        member.add(new Member("Freya", 184));
        
        member.stream()
                .forEach(person -> System.out.println(person));
        
        System.out.println();
        
        //sorting the stream that is to be printed using the sorted method
        member.stream()
                .sorted()
                .forEach(person -> System.out.println(person));
        
        System.out.println();
        
        //printing out an unsorted member stream
        member.stream()
                .forEach(person -> System.out.println(person));
        
        System.out.println();
        //sorting the list with the sort method of the Collections class
        Collections.sort(member);
        member.stream()
                .forEach(person -> System.out.println(person));
        
    }
}
