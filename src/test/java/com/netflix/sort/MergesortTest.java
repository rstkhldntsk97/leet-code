package com.netflix.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergesortTest {

    Mergesort main = new Mergesort();

    @Test
    void mergesort() {
        int[] res1 = main.mergesort(new int[]{9, 0, 1, 8, 7, 5, 6, 3, 4, 2});
        int[] res2 = main.mergesort(new int[]{90, -100, 80, 74, 50, 61, 3, 4, -2});
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, res1);
        assertArrayEquals(new int[]{-100, -2, 3, 4, 50, 61, 74, 80, 90}, res2);
    }

    @Test
    void merge() {
        int[] res1 = main.merge(new int[]{1, 3}, new int[]{2, 4, 5});
        int[] res2 = main.merge(new int[]{1, 3}, new int[]{2, 4});
        int[] res3 = main.merge(new int[]{1, 2, 3}, new int[]{3, 4});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, res1);
        assertArrayEquals(new int[]{1, 2, 3, 4}, res2);
        assertArrayEquals(new int[]{1, 2, 3, 3, 4}, res3);
    }

}