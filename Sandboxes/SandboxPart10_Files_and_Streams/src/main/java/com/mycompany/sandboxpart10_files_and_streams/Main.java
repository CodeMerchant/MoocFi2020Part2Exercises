/**
 * Streams are also very handy in handling files. The file is read in stream form
 * using Java's ready-made Files class. The 'lines' method in the files class allows 
 * us to create an input stream from a file, allowing you to process the rows
 * one by one. The 'lines' method gets a path as its parameter, which is created using
 * the 'get' method in the Paths class. the 'get' method is provided a string describing
 * the file path.
 * 
 * The example below reads all the lines in the file "file.txt" and adds them to the list
 * NB! The output will return an error as there is no file.txt file yet
 */
package com.mycompany.sandboxpart10_files_and_streams;

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
        List<String> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("files.txt"))
                    .forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        rows.stream()
                .sorted()
                .forEach(topPlayer -> System.out.println(topPlayer));
        
        
    }
}
