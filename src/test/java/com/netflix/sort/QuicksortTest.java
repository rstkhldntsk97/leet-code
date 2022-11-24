package com.netflix.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuicksortTest {

    Quicksort main = new Quicksort();

    @Test
    void quicksort() {
        var arr = new int[]{5, 3, 7, 2, 4, 6, 9, 1, 8};
        main.quicksort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

}