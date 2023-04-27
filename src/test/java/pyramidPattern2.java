package src.test.java;

import java.util.Scanner;

public class pyramidPattern2 {
    private static void printPattern(int rows){
        // for loop for the rows
        for(int i = 0;i<= rows; i++){
            // white spaces in front of the numbers
            int numberofwhitespaces = rows - i;

            //print the whitespaces
            printString(" ", numberofwhitespaces);

            // print numbers
            for(int x = 1; x<= i; x++){
                System.out.print(x+" ");
            }

            System.out.println("");
        }
    }

    private static void printString(String n, int times){
        for (int j = 0; j < times; j++) {
            System.out.print(n);
        }
    }

    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print:");

        int rows = sc.nextInt();

        sc.close();

        System.out.println("Printing Pattern 1\n");

        printPattern(rows);

    }
}
