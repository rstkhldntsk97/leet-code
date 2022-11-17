package com.netflix;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        var heaP = new HeapSort();
//        var heap = new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        var heap = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heaP.buildMaxHeap(heap);
//        heaP.maxHeapify(heap, 1, heap.length);
        System.out.println(Arrays.toString(heap));
    }

    public void buildMaxHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    public void maxHeapify(int[] heap, int i) {
        int N = heap.length;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest;
        if (l < N && heap[l] > heap[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r < N && heap[r] > heap[largest]) {
            largest = r;
        }
        if (largest != i) {
            // swap
            int tmp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = tmp;
            maxHeapify(heap, largest);
        }
    }

}
