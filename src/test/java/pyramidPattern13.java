package src.test.java;

import java.util.Scanner;

public class pyramidPattern13 {

    private static void printPattern(int rows){
        int count = 1;
        int step = rows-1;

        // for loop for the rows
        for(int i=1;i<=2*rows;i++){

            // second loop for spaces
            for(int j=1;j<=step;j++){
                System.out.print("\t");
            }

            for(int j=1; j<=count;j++){
                System.out.print("*\t");
            }

            if(i< (2*rows)/2){
                count++;
                step--;
            }
            else {
                count--;
                step++;
            }

            System.out.println();
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
