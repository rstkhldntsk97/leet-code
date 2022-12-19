package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {

    SpiralMatrix main = new SpiralMatrix();

    @Test
    void spiralOrder() {
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), main.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(List.of(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8), main.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}));
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), main.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

}