package com.netflix.sort;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcurrentMergesortTest {

    @Test
    public void concurrentMergesortTest() {
        int[] arr = new int[]{7, 11, 5, 1, 9, 3, 99, 10, 4, 8, 6, 2, 0};
        ForkJoinPool.commonPool().invoke(new ConcurrentMergesort(arr));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 99}, arr);
    }

}