package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateFunctionTest {

    RotateFunction main = new RotateFunction();

    @Test
    void maxRotateFunction() {
        assertEquals(26, main.maxRotateFunction(new int[]{4, 3, 2, 6}));
        assertEquals(330, main.maxRotateFunction(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

}