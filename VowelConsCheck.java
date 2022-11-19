package com.bridgelabz.logicalproblems;

//Java Program to count the total number of vowels and consonants in a string

public class VowelConsCheck {

    public static void vowelConsCheck(String str) {
        int vowelCount = 0, consonantCount = 0;
        char temp[] = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            //checking and printing if index value is vowel or consonant
            if (temp[i] == 'a' || temp[i] == 'e' || temp[i] == 'i' || temp[i] == 'o' || temp[i] == 'u') {
                System.out.println(temp[i] + " is vowel");
                vowelCount++;   //increasing vowel count
            } else {
                System.out.println(temp[i] + " is consonant");
                consonantCount++;  //increasing consonant count
            }
        }
        System.out.println("Total Vowel : " + vowelCount);
        System.out.println("Total Consonant : " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Chennai";
        //calling method
        vowelConsCheck(str);

    }
}
