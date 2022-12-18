package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtTest {

    @Test
    void mySqrt() {
        var main = new Sqrt();
        assertEquals(2,main.mySqrt(4));
        assertEquals(2,main.mySqrt(8));
        assertEquals(3,main.mySqrt(12));
        assertEquals(4,main.mySqrt(16));
        assertEquals(4,main.mySqrt(20));
        assertEquals(5,main.mySqrt(25));
        assertEquals(46340,main.mySqrt(2147395600));
    }

}