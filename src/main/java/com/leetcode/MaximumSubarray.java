package com.leetcode;

public class MaximumSubarray {

    // -2, 1, -3, 4, -1, 2, 1, -5, 4
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            if (max < end) max = end;
            if (end < 0 ) end = 0;
        }
        return max;
    }

}
