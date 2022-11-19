package com.bridgelabz.logicalproblems;

//Java Program to find the frequency of characters

public class FrequencyChar {


    public static void frequencyCheck(String str) {
        int[] count = new int[str.length()];

        char[] tempArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            count[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (tempArray[i] == tempArray[j]) {
                    count[i]++;

                    //avoiding visited characters
                    tempArray[j] = '0';
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (tempArray[i] != ' ' && tempArray[i] != '0')
                System.out.println(tempArray[i] + "              " + count[i]);
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        frequencyCheck(str);

    }
}


