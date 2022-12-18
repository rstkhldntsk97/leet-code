package com.leetcode;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortedListsTest {

    MergeSortedLists main = new MergeSortedLists();

    @Test
    void mergeTwoLists() {
        // list 1
        var l3 = new ListNode(4);
        var l2 = new ListNode(3, l3);
        var l1 = new ListNode(1, l2);
        // list 2
        var n3 = new ListNode(4);
        var n2 = new ListNode(2, n3);
        var n1 = new ListNode(1, n2);
        // result list
        var rl6 = new ListNode(4);
        var rl5 = new ListNode(4, rl6);
        var rl4 = new ListNode(3, rl5);
        var rl3 = new ListNode(2, rl4);
        var rl2 = new ListNode(1, rl3);
        var rl1 = new ListNode(1, rl2);
        assertEquals(rl1, main.mergeTwoLists(n1, l1));
    }

}