/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_readingcsvfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        List<Person> clutchPlayers = new ArrayList<>();
        
        try {
            //readind the 'file.txt' file line by line
            Files.lines(Paths.get("file.txt"))
                    //splitting the row into parts on the ";" character
                    .map(row -> row.split(";"))
                    //deleting the split rows that have less than two parts (We want the rows to always contain both name and birth year)
                    .filter(parts -> parts.length >= 2)
                    //creating persons from the parts
                    .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
                    //add the persons to the list
                    .forEach(person -> clutchPlayers.add(person));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
