package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAverageDifferenceTest {

    MinimumAverageDifference main = new MinimumAverageDifference();

    @Test
    void minimumAverageDifference() {
        assertEquals(3, main.minimumAverageDifference(new int[]{2, 5, 3, 9, 5, 3}));
        assertEquals(2, main.minimumAverageDifference(new int[]{1, 4, 5, 6, 3, 3, 6, 2, 1, 1}));
    }

}