package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.print("დალაგებული მასივი: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}