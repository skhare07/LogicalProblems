package com.bridgelabz.logicalproblems;
//Prime Number Program in Java

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many prime number you want to print : ");    //taking input from user
        int range = sc.nextInt();

        int num = 1;
        int count = 0;       //number of prime numbers

        while (count < range) {
            int primeCount = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    primeCount++;
                }

            }
            if (primeCount == 2) {                   //if primeCount = 2 , means it is a prime number
                System.out.print(num + " ");         // printing prime numbers
                count++;
            }
            num++;       //incrementing num if prime number
        }
    }

    public static void main(String[] args) {
        primeNum();
    }     //calling method

}
