package com.bridgelabz.logicalproblems;

//Java Program to Find Smallest Number in an array
//using inheritence concept ,extending SortArray class

public class SmallestElement extends SortArray {

    public static void smallestCheck(int arr[]) {

        arraySort(arr);
        System.out.println();
        //print first element after sorting the array
        System.out.println("Smallest number : " + arr[0]);

    }

    public static void main(String[] args) {
        int arr[] = {78, 89, 45, 34, 165};

        smallestCheck(arr);

    }

}
