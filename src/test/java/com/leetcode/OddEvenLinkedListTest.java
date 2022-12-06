package com.leetcode;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddEvenLinkedListTest {

    OddEvenLinkedList main = new OddEvenLinkedList();

    @Test
    void oddEvenList() {
        var l5 = new ListNode(5);
        var l4 = new ListNode(4, l5);
        var l3 = new ListNode(3, l4);
        var l2 = new ListNode(2, l3);
        var l1 = new ListNode(1, l2);
        var res = main.oddEvenList(l1);
        assertEquals("1, 3, 5, 2, 4", res.toString());
//        assertEquals("5", main.oddEvenList(l5).toString());
    }

}