package com.bridgelabz.logicalproblems;

//Java Program to Display Even and Odd Numbers From 1 to 100

public class EvenOddNum {

    public static void oddNumCheck() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }

        }
    }

    public static void main(String[] args) {
        oddNumCheck();
    }

}
