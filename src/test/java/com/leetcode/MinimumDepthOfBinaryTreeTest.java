package com.leetcode;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthOfBinaryTreeTest {
    MinimumDepthOfBinaryTree main = new MinimumDepthOfBinaryTree();

    @Test
    void minDepth() {
        var rightLeft = new TreeNode(15);
        var rightRight = new TreeNode(7);
        var rootLeft = new TreeNode(9);
        var rootRight = new TreeNode(20, rightLeft, rightRight);
        var root = new TreeNode(3, rootLeft, rootRight);
        assertEquals(2, main.minDepth(root));
    }
}