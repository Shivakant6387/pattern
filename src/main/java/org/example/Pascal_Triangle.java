package org.example;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int i, j, space;
        int coef, rows;
        coef = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        rows = sc.nextInt();

        for (i = 0; i < rows; i++) {
            for (space = 1; space <= rows - i; space++)
                System.out.print(" ");

            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 1) / j;

                System.out.print(coef + " ");
            }
            System.out.println();

        }
    }
}
