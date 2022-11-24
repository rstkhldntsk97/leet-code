package com.netflix.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void sort() {
        var main = new InsertionSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, main.sort(new int[]{5, 2, 4, 6, 1, 3}));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, main.sort(new int[]{5, 3, 2, 1, 6, 8, 4, 7, 9, 0}));
    }

}