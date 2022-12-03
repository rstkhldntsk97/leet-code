package com.leetcode.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters main = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, main.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, main.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, main.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, main.lengthOfLongestSubstring(""));
        assertEquals(1, main.lengthOfLongestSubstring(" "));
        assertEquals(2, main.lengthOfLongestSubstring("au"));
        assertEquals(2, main.lengthOfLongestSubstring("aab"));
        assertEquals(3, main.lengthOfLongestSubstring("dvdf"));
        assertEquals(6, main.lengthOfLongestSubstring("asjrgapa"));
    }

}