package src.test.java;

import java.util.Scanner;

public class pyramidPattern15 {

    private static void printPattern(int rows){

        int count = 1;
        int step1 = rows-2;
        int step2 = 1;

        // for loop for the rows
        for(int i=1;i<=rows;i++){

            if(i==1){
                for(int j=1;j<=rows-1;j++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                System.out.println();
            } else if (i==rows) {
                // for printing stars

                for(int j=1;j<2*i;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }else {
                // for printing spaces
                for(int j = 1; j <= step1; j++){
                    System.out.print("\t");
                }

                //for printing stars
                for(int j = 1; j <= count; j++){
                    System.out.print("*\t");
                }

                // for printing spaces again

                for(int j = 1; j <= step2; j++){
                    System.out.print("\t");
                }

                // for printing stars
                for(int j = 1; j <= count; j++){
                    System.out.print("*\t");
                }

                step1--;
                step2+=2;

                System.out.println();

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
