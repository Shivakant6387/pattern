package org.example;

import java.util.Scanner;

public class Alphabet_B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n/2;j++){
                if ((j==1 || j==n/2)&& i!=1 ||i==1 && j!=n/2 ||i==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=1;i<=n-i-1;i++){
            System.out.print("*");
        }
    }
}
