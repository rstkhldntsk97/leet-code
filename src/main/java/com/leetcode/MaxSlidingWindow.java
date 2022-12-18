package com.leetcode;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            int lastIdx = i + k - 1;
            if (lastIdx >= nums.length) {
                break;
            }
            int currMax = findMaxInWindow(nums, i, lastIdx);
            result[i] = currMax;
        }
        return result;
    }

    private int findMaxInWindow(int[] nums, int start, int end) {
        int max = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

}
