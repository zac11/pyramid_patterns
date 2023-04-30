package src.test.java;

import java.util.Scanner;

public class pyramidPattern12 {
    private static void printPattern(int rows){

        int count = 1;

        // first loop for the rows
        for(int i=1;i<=2*rows;i++){

            // loop for printing the stars

            for(int j=1;j<= count;j++){
                System.out.print("*\t");
            }

            //if condition
            if(i<(2*rows)/2){
                count++;
            }
            else{
                count--;
            }
            System.out
                    .println();
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
