package com.netflix;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        var main = new Quicksort();
        var arr = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        main.quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void quicksort(int[] arr, int first, int last) {
        if (first < last) {
            int q = partition(arr, first, last);
            quicksort(arr, first, q - 1);
            quicksort(arr, q + 1, last);
        }
    }

    private int partition(int[] arr, int first, int last) {
        int x = arr[last];
        int i = first - 1;
        for (int j = first; j < last - 1; j++) {
            if (arr[j] <= x) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = tmp;
        return i + 1;
    }

}
