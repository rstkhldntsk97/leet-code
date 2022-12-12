package com.leetcode;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeMaximumPathSumTest {

    BinaryTreeMaximumPathSum main = new BinaryTreeMaximumPathSum();

    @Test
    void maxPathSumCaseOne() {
        var rootLeft = new TreeNode(2);
        var rootRight = new TreeNode(3);
        var root = new TreeNode(1, rootLeft, rootRight);
        assertEquals(6, main.maxPathSum(root));
    }

    @Test
    void maxPathSumCaseTwo() {
        var leftLeft = new TreeNode(15);
        var leftRight = new TreeNode(7);
        var rootLeft = new TreeNode(9);
        var rootRight = new TreeNode(20, leftLeft, leftRight);
        var root = new TreeNode(-10, rootLeft, rootRight);
        assertEquals(42, main.maxPathSum(root));
    }

}