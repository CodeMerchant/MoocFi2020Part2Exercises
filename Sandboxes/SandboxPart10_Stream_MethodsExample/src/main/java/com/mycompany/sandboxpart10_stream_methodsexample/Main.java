/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_stream_methodsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);
        
        //adding filtered values to new ArrayList using .collect method
        
        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5) //we want to extract all the values that are greater than 5
                .map(value -> value * 2) //We want to multiply all the values that are above 5 by 2
                .collect(Collectors.toCollection(ArrayList:: new)); //adding the values to the values list
        
        values.forEach((value) -> {
            System.out.println(value);
        });
        System.out.println("");
        System.out.println("using count() terminal operation");
        //Terminal operations: The count() method
        System.out.println("Values: " + values.stream().count()); //should return 2 since we filtered the values
        
        System.out.println("");
        
        System.out.println("using forEach() terminal operation");
        //Terminal operations: The ForEach method
        values.stream()
                .forEach(value -> System.out.println( value));
        
        System.out.println("");
        //reduce method is useful when you want to combine stream elements
        //to some other form. Below we use the reduce method to calculate the sum of an integer list
        
        ArrayList<Integer> intValues = new ArrayList<>();
        intValues.add(7);
        intValues.add(3);
        intValues.add(2);
        intValues.add(1);
        
        int sum = intValues.stream()
                .reduce(0, (previousSum, value) -> previousSum + value);
        System.out.println("sum using reduce() method:" + sum);
        
        System.out.println("");
        
        //using the reduce method to form a combined row-separated string from a list of strings
        
        List<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");
        
        String combined = words.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
                System.out.println(combined);
    }
    
    
   
}
