/**
 * Write a program that reads input from a user and prints statistics
 * about those inputs. When the user enters the string 'end', the reading is stopped.
 * Other inputs are numbers in string format. When you stop reading inputs, the
 * program prints the number of positive integers divisible by 3, and the average
 * of all values.
 */
package com.mycompany.sandboxpart9_handlingcollectionsasstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        //reading inputs
        while (true) {
            String row = scan.nextLine();

            if (row.equalsIgnoreCase("end")) {
                break;
            }

            inputs.add(row);
        }
        
        //Counting the number of values divisible by 3
        
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();
        
        //working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        //printing out the stats
        System.out.println("Divisible by three: " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
        
    }
}
