/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WritingToFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        //Writing data to files
        /**
         * The PrintWriter class offers the functionality to write to files
         *
         * The constructor of the PrintWriter class receives as its parameter a
         * string that represents the location of the target file
         *
         */

        try (PrintWriter writer = new PrintWriter("file.txt")) {
            writer.println("Manchester United Squad"); //writes the string "Manchester..." and line change to the file
            writer.println("2020/21");
            writer.print("Manager: Ole Gunnar Solsjkaer"); //writes the string to the file without a line change
            writer.close(); //closes the file and ensures that the written text is saved to the file
        }
        
        writeToFile("file2.txt", "1.David De Gea");// We've chosen to create a new file instead of overwriting the file 'file.txt'

    }
    //using a method
    public static void writeToFile(String fileName, String text) throws Exception{
        PrintWriter writer = new PrintWriter(fileName); //will create a new file or overwrite data in existing file
        writer.println(text);
        writer.close();
    }
}
