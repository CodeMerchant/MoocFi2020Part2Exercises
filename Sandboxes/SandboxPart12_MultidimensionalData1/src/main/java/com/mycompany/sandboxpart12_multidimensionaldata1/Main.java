package com.mycompany.sandboxpart12_multidimensionaldata1;

/**
 *
 * @author musa
 */
public class Main {

    public static void main(String[] args) {

        /*
        Previously we have used one dimensional arrays, where the index tells
        us the location of a value in the only dimension. We can also create
        multidimensional arrays. Then we need the indexes of a value in each
        dimension to access the value. This comes in handy when our data is
        multidimensional, for example when dealing with cordinates.
        
        We can create a 2D array like so:
        
        int rows = 2;
        int columns = 3;
        
        int[][] twoDArray = new int[rows][columns];
        
        In the array above, each row refers to an array with a certain number 
        of columns. We can iterate over a 2D array using two nested for-loops
        like so:
        
        System.out.println("row, column, value");

        for (int row = 0; row < twoDArray.length; row++) {
            for (int column = 0; column < twoDArray[row].length; column++) {
                int value = twoDArray[row][column];

                System.out.println("" + row + ", " + column + ", " + value);
            }
        }
        
         */
        int rows = 2;
        int columns = 3;

        int[][] twoDArray = new int[rows][columns];
        
        twoDArray[0][1] = 4;
        twoDArray[1][1] = 1;
        twoDArray[1][0] = 8;

        

        for (int row = 0; row < twoDArray.length; row++) {
            for (int column = 0; column < twoDArray[row].length; column++) {
                int value = twoDArray[row][column];

                System.out.println("Value stored at row[" + row + "] \tcolumn[" + column + "] \t is: " + value);
            }
        }

    }
    public static String arrayAsString(int[][] array){
       StringBuilder numbers = new StringBuilder();
       
        for(int[]x : array){
            for(int y : x){
                numbers.append(y);
            }
            numbers.append("\n");
        }
        
        return numbers.toString();
    }
}
