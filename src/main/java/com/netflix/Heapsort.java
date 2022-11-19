package com.netflix;

public class Heapsort {

    public void heapsort(int[] arr) {
        int N = arr.length;
        buildMaxHeap(arr, N);
        for (int i = N - 1; i >= 0; i--) {
            var tmp = arr[0];
            arr[0] = arr[N - 1];
            arr[N - 1] = tmp;
            N = N - 1;
            maxHeapify(arr, 0, N);
        }
    }

    public void buildMaxHeap(int[] arr, int N) {
        for (int i = N / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, N);
        }
    }

    public void maxHeapify(int[] heap, int i, int N) {
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
            maxHeapify(heap, largest, N);
        }
    }

}
