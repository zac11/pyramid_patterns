package src.test.java;

import java.util.Scanner;

public class pyramidPattern4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.format("%" + 4 * (rows - i + 1) + "s", "");
            for (int j = i + 1; j > 1; j--)
                System.out.format("%4d", j);
            for (int j = 1; j <= i + 1; j++)
                System.out.format("%4d", j);

            System.out.println();
        }
    }
}