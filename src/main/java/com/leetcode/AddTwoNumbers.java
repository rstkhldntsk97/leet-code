package com.leetcode;

import com.leetcode.utils.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var curr1 = l1;
        var curr2 = l2;
        int reminder = 0;
        var root = new ListNode();
        var currRoot = root;
        while (curr1 != null && curr2 != null) {
            int localRes = curr1.val + curr2.val;
            if (reminder > 0) {
                localRes = localRes + reminder;
            }
            if (localRes / 10 > 0) {
                reminder = localRes / 10;
                currRoot.val = localRes - 10;
            } else {
                reminder = 0;
                currRoot.val = localRes;
            }
            if (curr1.next != null && curr2.next != null) {
                currRoot.next = new ListNode();
                currRoot = currRoot.next;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while (curr1 != null) {
            currRoot.next = new ListNode();
            currRoot = currRoot.next;
            int localRes = curr1.val + reminder;
            if (localRes / 10 > 0) {
                reminder = localRes / 10;
                currRoot.val = localRes - 10;
            } else {
                reminder = 0;
                currRoot.val = localRes;
            }
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            currRoot.next = new ListNode();
            currRoot = currRoot.next;
            int localRes = curr2.val + reminder;
            if (localRes / 10 > 0) {
                reminder = localRes / 10;
                currRoot.val = localRes - 10;
            } else {
                reminder = 0;
                currRoot.val = localRes;
            }
            curr2 = curr2.next;
        }
        if (reminder > 0) {
            currRoot.next = new ListNode(reminder);
        }
        return root;
    }

}
