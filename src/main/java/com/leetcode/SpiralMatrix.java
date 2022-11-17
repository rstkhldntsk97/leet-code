package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}));
        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        var nums = new ArrayList<Integer>();
        var top = 0;
        var bottom = matrix.length - 1;
        var left = 0;
        var right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;
        while (nums.size() < size) {
            for (int i = left; i <= right && nums.size() < size; i++) {
                nums.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom && nums.size() < size; i++) {
                nums.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && nums.size() < size; i--) {
                nums.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top && nums.size() < size; i--) {
                nums.add(matrix[i][left]);
            }
            left++;
        }
        return nums;
    }

}
