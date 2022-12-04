package com.leetcode;

import java.util.Arrays;

public class MinimumAverageDifference {

    public int minimumAverageDifference(int[] nums) {
        int minAvgDiff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int curAvgDiff = avgDifference(nums, i);
            if (minAvgDiff > curAvgDiff) {
                minAvgDiff = curAvgDiff;
                res = i;
            }
        }
        return res;
    }

    // input --> 2, 5, 3, 9, 5, 3
    // idx 0 --> (2 / 1) - (5 + 3 + 9 + 5 + 3) / 5|
    // idx 1 --> (2 + 5) / 2 - (3 + 9 + 5 + 3) / 4|
    // idx 2 --> (2 + 5 + 3) / 3 - (9 + 5 + 3) / 3|
    // idx 3 --> (2 + 5 + 3 + 9) / 4 - (5 + 3) / 2|
    // idx 4 --> (2 + 5 + 3 + 9 + 5) / 5 - 3 / 1|
    // idx 5 --> (2 + 5 + 3 + 9 + 5 + 3) / 6 - 0|
    public int avgDifference(int[] nums, int i) {
        int[] left = Arrays.copyOfRange(nums, 0, i + 1);
        int[] right = Arrays.copyOfRange(nums, i + 1, nums.length);
        int leftSum = Arrays.stream(left).sum();
        int rightSum = Arrays.stream(right).sum();
        int leftRes = leftSum / left.length;
        int rightRes = right.length == 0 ? 0 : rightSum / right.length;
        return Math.abs(leftRes - rightRes);
    }

}
