package org.example;

import java.util.Scanner;

public class Alphabet_A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=scanner.nextInt();
        for (int i = 0; i<=n; i++)
        {
// Inner for loop for logic execution
            for (int j = 0; j<= n / 2; j++)
            {
// prints two vertical lines
                if ((j == 0 || j == n / 2) && i != 0 ||
// print first line of alphabet
                        i == 0  && j != n / 2 ||
// prints middle line
                        i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }
        for (int i=0;i<=n-i;i++){
            System.out.print("*");
        }
    }
}
