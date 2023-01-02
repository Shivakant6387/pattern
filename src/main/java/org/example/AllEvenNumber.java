package org.example;

import java.util.Scanner;

public class AllEvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of the n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
}
