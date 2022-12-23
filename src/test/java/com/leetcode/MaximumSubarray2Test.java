package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaximumSubarray2Test {

    MaximumSubarray2 main = new MaximumSubarray2();

    @Test
    void maxSubArray() {
        assertArrayEquals(new int[]{4, -1, 2, 1}, main.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertArrayEquals(new int[]{1}, main.maxSubArray(new int[]{1}));
        assertArrayEquals(new int[]{5, 4, -1, 7, 8}, main.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        assertArrayEquals(new int[]{8}, main.maxSubArray(new int[]{5, -4, -1, -7, 8}));
    }

}