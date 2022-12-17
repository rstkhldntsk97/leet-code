package com.leetcode;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeKSortedListsTest {

    MergeKSortedLists main = new MergeKSortedLists();

    @Test
    void mergeKLists() {
        // list 1
        var n3 = new ListNode(4);
        var n2 = new ListNode(2, n3);
        var n1 = new ListNode(1, n2);
        // list 2
        var l3 = new ListNode(4);
        var l2 = new ListNode(3, l3);
        var l1 = new ListNode(1, l2);
        // list 3
        var k3 = new ListNode(6);
        var k2 = new ListNode(3, k3);
        var k1 = new ListNode(2, k2);
        // list 4
        var p3 = new ListNode(5);
        var p2 = new ListNode(4, p3);
        var p1 = new ListNode(3, p2);
        // result list
        var r12 = new ListNode(6);
        var r11 = new ListNode(5, r12);
        var r10 = new ListNode(4, r11);
        var r9 = new ListNode(4, r10);
        var r8 = new ListNode(4, r9);
        var r7 = new ListNode(3, r8);
        var r6 = new ListNode(3, r7);
        var r5 = new ListNode(3, r6);
        var r4 = new ListNode(2, r5);
        var r3 = new ListNode(2, r4);
        var r2 = new ListNode(1, r3);
        var r1 = new ListNode(1, r2);
        assertEquals(r1, main.mergeKLists(new ListNode[]{n1, l1, k1, p1}));
        assertNull(main.mergeKLists(new ListNode[]{}));
        assertEquals(r1, main.mergeKLists(new ListNode[]{r1}));
    }

}