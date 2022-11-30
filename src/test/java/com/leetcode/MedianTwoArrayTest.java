package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianTwoArrayTest {

    MedianTwoArray main = new MedianTwoArray();

    @Test
    void findMedianSortedArrays() {
        double res1 = main.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        double res2 = main.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assertEquals(2.0, res1);
        assertEquals(2.5, res2);
    }

}