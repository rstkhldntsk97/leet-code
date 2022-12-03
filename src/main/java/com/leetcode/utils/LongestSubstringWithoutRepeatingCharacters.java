package com.leetcode.utils;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        var max = 0;
        var cur = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (!cur.contains(chars[j])) {
                    cur.add(chars[j]);
                } else {
                    max = Math.max(max, cur.size());
                    cur.clear();
                    j--;
                }
            }
            max = Math.max(max, cur.size());
            cur.clear();
        }
        return max;
    }

}
