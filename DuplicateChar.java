package com.bridgelabz.logicalproblems;

//Java program to find the duplicate characters in a string

public class DuplicateChar {

    public static void duplicateCheck(String str) {
        int count = 0;
        String temp = "";
        char[] tempArray = str.toCharArray();
        System.out.println("Duplicate characters : ");
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (tempArray[i] == tempArray[j]) {
                    System.out.print(tempArray[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "hello friends ";
        duplicateCheck(str);

    }
}
