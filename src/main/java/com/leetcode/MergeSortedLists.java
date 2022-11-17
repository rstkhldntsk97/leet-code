package com.leetcode;

import com.leetcode.utils.ListNode;

public class MergeSortedLists {

    public static void main(String[] args) {
        var n3 = new ListNode(4);
        var n2 = new ListNode(2, n3);
        var n1 = new ListNode(1, n2);

        var l3 = new ListNode(4);
        var l2 = new ListNode(3, l3);
        var l1 = new ListNode(1, l2);

        ListNode node = mergeTwoLists(n1, l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return dummy.next;
    }

}
