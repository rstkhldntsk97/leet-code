package com.leetcode;

import com.leetcode.utils.TreeNode;

import java.util.Stack;

public class PrintTree {

    public static void printInOrder(TreeNode root) {
        var stack = new Stack<TreeNode>();
        var curr = root;
        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.println(curr.val);
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        var rightLeft = new TreeNode(25);
        var rightRight = new TreeNode(35);
        var leftLeft = new TreeNode(5);
        var leftRight = new TreeNode(15);
        var rootLeft = new TreeNode(10, leftLeft, leftRight);
        var rootRight = new TreeNode(30, rightLeft, rightRight);
        var root = new TreeNode(20, rootLeft, rootRight);
        printInOrder(root);
    }

}
