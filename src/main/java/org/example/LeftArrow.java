package org.example;

import java.util.Scanner;

public class LeftArrow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
