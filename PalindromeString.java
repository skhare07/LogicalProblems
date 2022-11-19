package com.bridgelabz.logicalproblems;

//Java Program to determine whether a given string is palindrome


public class PalindromeString {

    public static void palindromeCheck(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {   //running for loop from last and storing every index in temp string
            temp += str.charAt(i);
        }

        char[] str1=str.toCharArray();
        char[] temp1=temp.toCharArray();

        int i = 0;
            //checking if both the reverse and original string matches
            if (str1[i] == temp1[i]) {
                System.out.println("Palindrome");
                i++;
            } else {
                System.out.println("Not palindrome");

            }
        }



    public static void main(String[] args) {
        String str = "aabbccbbaa";
        palindromeCheck(str);

    }
}
