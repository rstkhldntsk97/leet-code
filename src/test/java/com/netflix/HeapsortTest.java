package com.netflix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapsortTest {

    Heapsort main = new Heapsort();

    @Test
    void heapSort() {
        var heap = new int[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
        var heap1 = new int[]{5, 13, 2, 25, 7, 17, 20, 8, 4};
        main.heapsort(heap);
        main.heapsort(heap1);
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 7, 8, 9, 10, 14, 16}), Arrays.toString(heap));
        assertEquals(Arrays.toString(new int[]{2, 4, 5, 7, 8, 13, 17, 20, 25}), Arrays.toString(heap1));
    }

    @Test
    void maxHeapify() {
        var heap = new int[]{16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        main.maxHeapify(heap, 1, heap.length);
        assertEquals(Arrays.toString(new int[]{16, 14, 10, 8, 7, 9, 3, 2, 4, 1}), Arrays.toString(heap));
    }

    @Test
    void buildMaxHeap() {
        var heap = new int[]{5, 3, 17, 10, 84, 19, 6, 22, 9};
        main.buildMaxHeap(heap, heap.length);
        assertEquals(Arrays.toString(new int[]{84, 22, 19, 10, 3, 17, 6, 5, 9}), Arrays.toString(heap));
    }

}
