package src.test.java;

import java.util.Scanner;

public class pyramidPattern3 {

    private static void printPattern(int rows){
        // for loop for the rows
        for(int i=0;i<= rows;i++){
             // print the whitespaces
            int numberofwhitespaces = rows - i ;

            //print the whitespaces
            printString(" ", numberofwhitespaces);

            // print the * characters for the number of times
            printString("* ", i);

            // move to next line
            System.out.println("");
        }
    }

    private static void printString(String s, int times){
        // print the string for times count
        for(int j=0; j< times;j++){
            System.out.print(s);
        }
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print:");

        int rows = sc.nextInt();

        sc.close();

        System.out.println("Printing Pattern of * 1\n");

        printPattern(rows);

    }
}
