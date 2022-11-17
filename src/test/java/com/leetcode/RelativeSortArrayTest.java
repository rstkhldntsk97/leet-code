package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelativeSortArrayTest {

    private final RelativeSortArray main = new RelativeSortArray();

    @Test
    public void relativeSortArrayTest() {
        assertEquals(Arrays.toString(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}), Arrays.toString(main.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
        assertEquals(Arrays.toString(new int[]{22, 28, 8, 6, 17, 44}), Arrays.toString(main.relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6})));
    }

}
