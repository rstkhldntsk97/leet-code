package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TactileKeypad {

    public List<String> solve(List<String> input, String number) {
        var output = new ArrayList<String>();
        for (String word : input) {
            String wordAsNumber = toNumber(word);
            if (number.contains(wordAsNumber)) output.add(word);
        }
        return output;
    }

    public String toNumber(String word) {
        int[] arr = new int[]{2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        var alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int posInAlpha = alphabet.indexOf(word.charAt(i));
            sb.append(arr[posInAlpha]);
        }
        return sb.toString();
    }
}
