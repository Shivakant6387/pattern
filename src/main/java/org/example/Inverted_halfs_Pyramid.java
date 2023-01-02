package org.example;

import java.util.Scanner;

public class Inverted_halfs_Pyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n number");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
