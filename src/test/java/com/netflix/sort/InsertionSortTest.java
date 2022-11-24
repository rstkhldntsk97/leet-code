package com.netflix.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void sort() {
        var main = new InsertionSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, main.sort(new int[]{5, 2, 4, 6, 1, 3}));
        assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, main.sort(new int[]{31, 41, 59, 26, 41, 58}));
    }

    @Test
    void decreasingSort() {
        var main = new InsertionSort();
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, main.decreasingSort(new int[]{5, 2, 4, 6, 1, 3}));
        assertArrayEquals(new int[]{59, 58, 41, 41, 31, 26}, main.decreasingSort(new int[]{31, 41, 59, 26, 41, 58}));
    }

}