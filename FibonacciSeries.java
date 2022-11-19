package com.bridgelabz.logicalproblems;

import java.util.Scanner;

//Fibonacci Series in Java

public class FibonacciSeries {

    public void fibSeries() {
        int n1 = 0, n2 = 1, n3, count;         //first and second number in series is 0 and 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range :");
        count = scanner.nextInt();

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; i++) {     //0 and 1 are fixed
            n3 = n1 + n2;

            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


    }

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.fibSeries();
    }
}
