package com.bridgelabz.searchandsort;
//Binary Search program
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    int arr[] = new int[10];
    int key;
    Scanner scanner = new Scanner(System.in);

    public void getData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter number to search");
        key = scanner.nextInt();
    }

    public void search() {
        int i, j, mid, pos = 0, flag = 0;
        i = 0;
        j = arr.length - 1;
        while ((i <= j && flag == 0)) {
            mid = (i + j) / 2;

            if (arr[mid] == key) {
                flag = 1;
                pos = mid + 1;
            }
            if (arr[mid] > key) {
                j = mid - 1;
            }
            if (arr[mid] < key) {
                i = mid + 1;
            }

            if (flag == 1) {
                System.out.println(key + " found at position " + pos);
            } else {
                System.out.println("Not found");
            }
        }
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        obj.getData();
        obj.search();
    }
}
