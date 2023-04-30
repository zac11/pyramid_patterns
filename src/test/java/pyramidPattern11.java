package src.test.java;

import java.util.Scanner;

public class pyramidPattern11 {

    private static void printPattern(int rows){

        int count = 1;
        int step = rows/2;

        // for loop for rows
        for(int i=1;i<=rows;i++){

            for(int j=1; j<=step; j++){
                System.out.print("\t");
            }

            // for loop for printing stars
            for(int j=1;j<=count; j++){
                System.out.print("*\t");
            }

            if(i<=rows/2){
                count+=2;
                step--;
            }else{
                count-=2;
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
