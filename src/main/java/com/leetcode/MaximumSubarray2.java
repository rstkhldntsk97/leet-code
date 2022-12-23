package com.leetcode;

public class MaximumSubarray2 {

    // -2, 1, -3, 4, -1, 2, 1, -5, 4
    public int[] maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxEnd = 0, start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEnd += nums[i];
            if (max < maxEnd) {
                max = maxEnd;
                end = i;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
                start = i + 1;
            }
        }
        var result = new int[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[start++];
        }

        return result;
    }

}
