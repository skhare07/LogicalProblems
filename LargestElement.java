package com.bridgelabz.logicalproblems;

//Java Program to Find Largest Number in an array
//using inheritence concept ,extending SortArray class

public class LargestElement extends SortArray {

    public static void largestCheck(int arr[]) {

        arraySort(arr);
        System.out.println();
        //print last element after sorting the array
        System.out.println("Largest number : " + arr[arr.length - 1]);

    }

    public static void main(String[] args) {
        int arr[] = {78, 89, 45, 34, 165};

        largestCheck(arr);

    }

}
