package src.test.java;

import java.util.Scanner;

public class pyramidPattern6 {
    private static void printPattern(int rows){
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print character
            printString(i+" ", i);

            //move to next line
            System.out.println("");
        }
    }

    private static void printString(String s, int times){
        for(int j=0;j<times;j++){
            System.out.print(s);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print:");

        int rows = sc.nextInt();

        sc.close();

        System.out.println("Printing Pattern\n");

        printPattern(rows);
    }
}
