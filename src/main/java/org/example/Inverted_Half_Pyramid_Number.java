package org.example;

import java.util.Scanner;

public class Inverted_Half_Pyramid_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter value of the n");
        int n=scanner.nextInt();
      //  for (int i=n; i>=1;i--){
        for(int i=1;i<=n;i++){
           // for (int j=1;j<=i;j++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
