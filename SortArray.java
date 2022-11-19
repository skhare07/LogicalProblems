package com.bridgelabz.logicalproblems;

//How to Sort an Array in Java

public class SortArray {

    public static void arraySort(int arr[]) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    //swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //printing
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 1, 4, 2, 7, 3, 5, 6, 9};
        arraySort(arr);   //calling method
    }
}
