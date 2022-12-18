package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextGreaterElement1Test {

    NextGreaterElement1 main = new NextGreaterElement1();

    @Test
    void nextGreaterElement() {
        assertArrayEquals(new int[]{-1, 3, -1}, main.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, main.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }

}