package com.netflix;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        var main = new Quicksort();
        var arr = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        main.quicksort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private void quicksort(int[] arr, int first, int last) {
        if (first < last) {
            int q = partition(arr, first, last); // get the index of the sorted pivot
            quicksort(arr, first, q - 1);
            quicksort(arr, q + 1, last);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

}
