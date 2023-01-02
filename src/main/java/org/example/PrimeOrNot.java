package org.example;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of the n");
        int n=scanner.nextInt();
        boolean isPrime=true;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            if (n==1){
                System.out.println("This is neither prime not composite");
            }else {
                System.out.println("This is prime number");
            }
        }else {
            System.out.println("This is not a prime number");
        }
    }
}
