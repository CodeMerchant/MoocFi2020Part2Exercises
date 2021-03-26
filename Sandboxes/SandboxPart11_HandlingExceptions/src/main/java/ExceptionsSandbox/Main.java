/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsSandbox;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //System.out.print("Give number: ");
        //  int num = -1;
        // try {
        //     num = Integer.parseInt(read.nextLine());
        //     System.out.println("Thanks for inputting a number");
        //} catch (Exception e) {
        //   System.out.println("User input was not a number");
        // }
        readNumber(read);

        /**
         * Exceptions and Resources There is a separate exception handling for
         * reading operating system resources such as files. With so called
         * try-with-resources exception handling, the resource to be opened is
         * added to a non-compulsory part of the try block declaration in
         * brackets.
         *
         * The code below reads all lines from "file.txt" and adds them to an
         * ArrayList. Reading a file might throw an exception, so it requires a
         * try-catch block
         */
        ArrayList<String> linesList = new ArrayList<>();

        //1. Create Scanner object that will read the file
        try (Scanner scan = new Scanner(new File("file.txt"))) {

            //read all lines from the file and add to list
            while (scan.hasNextLine()) {
                linesList.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Give a number: ");

            try {
                int readNum = Integer.parseInt(reader.nextLine());
                return readNum;
            } catch (Exception e) {
                System.out.println("User input was not a number");
            }
        }
    }

    /**
     * The code below reads the file given to it as a parameter line by
     * line.Reading a file can throw exceptions -e.g. the file mightthe file
     * might not exist or the program might not have read rights to the file.
     * not exiThis kind of exception has to be ghandled. We'll handle it by
     * wrapping the code into a try-catch block.
     *
     *
     * @param fileName 
     * @return Name
     */
    public static List<String> readLines(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName))
                    .forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return lines;
    }
}
