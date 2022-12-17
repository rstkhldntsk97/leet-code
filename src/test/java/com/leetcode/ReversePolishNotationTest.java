package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationTest {

    ReversePolishNotation main = new ReversePolishNotation();

    @Test
    void evalRPN() {
        assertEquals(9, main.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, main.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, main.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

}