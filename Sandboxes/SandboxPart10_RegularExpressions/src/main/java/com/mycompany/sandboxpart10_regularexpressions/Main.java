/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxpart10_regularexpressions;

import java.util.Scanner;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentNumber = "011234567"; //returns true
        String studentNumber2 = "0112345678"; //returns false
        String studentNumber3 = "001234567"; //returns false
        /*
        studentNumber must start with 01, after that there needs to be 7 digits between 0 and 9
         */

        if (studentNumber.matches("01[0-9]{7}")) {
            System.out.println("Correct format, your student no is: " + studentNumber);
        } else {
            System.out.println("Incorrect format");
        }
        /**
         * Alternation - Vertical Line A vertical line indicates that parts of
         * regular expressions are optional. e.g. 00|111|0000 defines the
         * strings 00, 111 and 0000. The respond method returns true if the
         * string matches any of the specified group of alternatives.
         */
        String string = "00";
        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the three alternatives");
        }

        //We'll try with 1111. It shouldn't return true as we've explicitly
        //stated that we want either 00, 111 or 0000
        String string2 = "1111";

        if (string2.matches("00|111|0000")) {
            System.out.println("The string contained one of the alternatives");
        } else {
            System.out.println("The string contained none of the three alternatives. The incorrect string was: " + string2
                    + "\nmake sure your string has either one of these alternatives: 00,111 or 0000");
        }
        System.out.println("4");
        /**
         * Affecting Part of a String(Parenthesis) You can use parentheses to
         * determine which part of a regular expression is affected by the rules
         * inside the parentheses. If, for example, we wanted to allow 00000 and
         * 00001, we could do that by placing a vertical bar in between them
         * this way 00000|00001. Parentheses allow us to limit the option to a
         * specific part of the string. The expression 0000(0|1) specifies the
         * strings 00000 and 00001.
         *
         * In a similar fashion, the regular expression car(|s|) defines both
         * the singular (car) and plural(cars) forms of the word car.
         *
         */
        /**
         * Quantifiers. What is often desired is that a particular sub-string is
         * repeated in a string. The following expressions are available in
         * regular expressions:
         *
         */
        //The quantifier *repeats 0...times. e.g
        String string4 = "trololololo";

        if (string4.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
        System.out.println("5");
        //The quantifier + repeats 1...times. e.g:
        String string5 = "trolo";
        if (string5.matches("tro(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("incorrect form");
        }
        System.out.println("6");
        String string6 = "nanananananananana Batman!";

        if (string6.matches("(na)+ Batman!")) {
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }
        System.out.println("7");
        //The quantifier ? repeats 0 or 1 times. e.g. :
        String string7 = "You have to accidentally the whole meme";

        if (string7.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }
        
        System.out.println("8");
        //The quantifier {a} repeats a times
        String string8 = "1010";
        
        if(string8.matches("(10){2}")){
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }
        
        System.out.println("9");
        
        //The quantifier {a,b} repeats a...b times. e.g.:
        
        String string9 = "1";
        if(string9.matches("1{2,4}")){
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }
        System.out.println("10");
        //The quantifier {a,} repeats a ...times. e.g:
        
        String string10 = "11111"; 
        if (string10.matches("1{2,}")) {
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }
    }
}
