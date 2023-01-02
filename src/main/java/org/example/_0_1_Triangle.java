package org.example;

import java.util.Scanner;

public class _0_1_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of the n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1  ");
                }else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
