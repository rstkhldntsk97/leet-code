package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    BinarySearch main = new BinarySearch();

    @Test
    void search() {
        assertEquals(4, main.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, main.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

}