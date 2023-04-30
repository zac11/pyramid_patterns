package src.test.java;

import java.util.Scanner;

public class pyramidPattern14 {
    private static int getNumberFactorial(int num){
        int finalFactorial;
        for(finalFactorial=1;num > 1;num--){
            finalFactorial*=num;
        }

        return finalFactorial;
    }

    private static int getResult(int n, int i){
        int result = getNumberFactorial(n)/ ( getNumberFactorial(n - i)* getNumberFactorial(i));
        return result;
    }

    private static void printPattern(int rows){
        int count = rows-1;

        // for loop for the rows
        for(int i=0;i<=rows;i++){

            // for loop for the spaces
            for(int j=0;j<=count;j++){
                System.out.print("\t");
            }

            // for loop for printing numbers
            for(int j=0;j<=i;j++){
                System.out.print(getResult(i,j)+"\t \t");
            }

            count--;
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
