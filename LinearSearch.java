package com.bridgelabz.searchandsort;
//Linear Search Program
import java.util.Scanner;

public class LinearSearch {
    int arr[] = new int[5];
    Scanner scanner = new Scanner(System.in);

    //getting values form user and storing in array
    public void getData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value");
            arr[i] = scanner.nextInt();
        }
    }

    public int Key() {
        System.out.println("Enter element to search: ");
        int key = scanner.nextInt();
        return key;
    }

    //check if the value is present in the array
    public void search(int key) {
        int flag = 0, pos = 0;

        for (int i = 0; i < arr.length && flag == 0; i++) {
            if (arr[i] == key) {
                flag = 1;
                pos = i + 1;

            }
        }

        if (flag == 1) {
            System.out.println(key + " found on position :" + pos);
        } else {
            System.out.println(Key() + " not found");
        }
    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        //calling methods
        obj.getData();
        //obj.Key();
        obj.search(obj.Key());
    }

}
