package org.example;

import java.util.Scanner;

public class HollowRectange002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of the n");
        int n=scanner.nextInt();
        System.out.println("Please enter value of the m");
        int m=scanner.nextInt();
        //outer loop
        for (int i=1;i<=4;i++){
           // inner loop
            for (int j=1;j<=m;j++){
                if (i==1 ||j==1 ||i==n||j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
