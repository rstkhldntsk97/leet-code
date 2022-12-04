package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAverageDifferenceTest {

    MinimumAverageDifference main = new MinimumAverageDifference();

    @Test
    void minimumAverageDifference() {
        assertEquals(3, main.minimumAverageDifference(new int[]{2, 5, 3, 9, 5, 3}));
    }

    @Test
    void avgDifference() {
        assertEquals(3, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 0));
        assertEquals(2, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 1));
        assertEquals(2, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 2));
        assertEquals(0, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 3));
        assertEquals(1, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 4));
        assertEquals(4, main.avgDifference(new int[]{2, 5, 3, 9, 5, 3}, 5));
    }

}