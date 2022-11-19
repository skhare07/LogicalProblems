package com.bridgelabz.logicalproblems;

//Palindrome Program in Java

import java.util.Scanner;

public class PalindromeNum {

    public static void palindromeCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not");
        int num = scanner.nextInt();
        int remainder, sum = 0;


        int temp = num;
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }

        if (temp == sum)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not palindrome");
    }

    public static void main(String[] args) {
        palindromeCheck();
    }


}
