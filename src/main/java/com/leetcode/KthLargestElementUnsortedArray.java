package com.leetcode;

import java.util.PriorityQueue;

public class KthLargestElementUnsortedArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.remove();
        }
        return minHeap.remove();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{7, 1, 0, 5, 6, 3}, 3));
    }

}
