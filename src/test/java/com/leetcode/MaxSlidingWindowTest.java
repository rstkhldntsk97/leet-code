package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxSlidingWindowTest {

    MaxSlidingWindow main = new MaxSlidingWindow();

    @Test
    void maxSlidingWindow() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, main.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{1, -1}, main.maxSlidingWindow(new int[]{1, -1}, 1));
    }

}