package src.test.java;

import java.util.Scanner;

public class pyramidPattern7 {

    private static void printPattern(int rows){
        for(int i=rows;i>=1 ; i--){
            // print i*2 spaces at the beginning of each rows
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            // printing value of j where j starts from 1 to rows
            for(int j=i;j<=rows;j++){

            }
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
