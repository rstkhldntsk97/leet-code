package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    DailyTemperatures main = new DailyTemperatures();

    @Test
    void dailyTemperatures() {
        assertArrayEquals(new int[]{1, 1, 0}, main.dailyTemperatures(new int[]{30, 60, 90}));
        assertArrayEquals(new int[]{1, 1, 1, 0}, main.dailyTemperatures(new int[]{30, 40, 50, 60}));
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, main.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
        assertArrayEquals(new int[]{0, 1, 0, 3, 2, 1, 0, 0, 0, 0}, main.dailyTemperatures(new int[]{77, 41, 77, 41, 41, 41, 77, 77, 41, 41}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1, 0}, main.dailyTemperatures(new int[]{77, 77, 77, 77, 77, 78}));
    }

}