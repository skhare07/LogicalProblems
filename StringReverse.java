package com.bridgelabz.logicalproblems;

// Java Program to find Reverse of the string

public class StringReverse {

    public static void stringRev(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {   //running for loop from last and storing every index in temp string
            temp += str.charAt(i);
        }

        System.out.print(temp);

    }

    public static void main(String[] args) {
        String str = "hello friends";
        stringRev(str);        //calling method
    }
}
