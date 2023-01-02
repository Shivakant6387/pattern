package org.example;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of the n");
        int n=scanner.nextInt();
        System.out.println("show pattern");
        //upper half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
