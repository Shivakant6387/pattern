package org.example;

import java.util.Scanner;

public class AllOddNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter valur of the n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2==1) {
                System.out.print(i+ " ");
            }
        }

    }
}
