package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {

    MaximumSubarray main = new MaximumSubarray();

    @Test
    void maxSubArray() {
        assertEquals(6, main.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, main.maxSubArray(new int[]{1}));
        assertEquals(23, main.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

}