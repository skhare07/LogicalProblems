package com.bridgelabz.logicalproblems;

//Factorial Program in Java

import java.util.Scanner;

public class Factorial {

    public static void factorialCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int num = sc.nextInt();
        int factNum = 1;

        for (int i = 1; i <= num; i++) {
            factNum = factNum * i;
        }

        System.out.println("Factorial of " + num + " is " + factNum);

    }


    public static void main(String[] args) {
        factorialCheck();
    }
}
