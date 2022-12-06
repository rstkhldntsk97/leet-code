package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TactileKeypadTest {

    TactileKeypad main = new TactileKeypad();

    @Test
    void convert() {
        List<String> actual = main.solve(List.of("foo", "bar", "cap", "cat", "car", "foobar", "emo", "baz"), "3662277");
        var expected = List.of("foo", "bar", "cap", "car", "foobar", "emo");
        assertEquals(expected, actual);
    }

}