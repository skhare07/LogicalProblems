package com.bridgelabz.searchandsort;
//bubble sort program
import java.util.Scanner;

public class BubbleSort {

    int arr[] = new int[10];
    Scanner scanner = new Scanner(System.in);

    //storing values in array
    public void getData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value");
            arr[i] = scanner.nextInt();
        }
    }

    //printing array
    public void printData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        int i, j, temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        //calling methods
        obj.getData();
        obj.sort();
        obj.printData();
    }
}
