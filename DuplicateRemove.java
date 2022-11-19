package com.bridgelabz.logicalproblems;

//Java Program to Remove Duplicate Element in an array

public class DuplicateRemove {
    public static void duplicateCheck(char[] charArray) {
        System.out.println("After removing Duplicate characters : ");

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] != charArray[j]) {
                    System.out.print(charArray[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'b', '0', '0'};
        duplicateCheck(charArray);


    }


}
