package com.leetcode;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers main = new AddTwoNumbers();

    @Test
    void addTwoNumbers() {
//        var l3 = new ListNode(3);
//        var l2 = new ListNode(4, l3);
//        var l1 = new ListNode(2, l2);
//
//        var k3 = new ListNode(4);
//        var k2 = new ListNode(6, k3);
//        var k1 = new ListNode(5, k2);
//
//        var r3 = new ListNode(8);
//        var r2 = new ListNode(0, r3);
//        var r1 = new ListNode(7, r2);
//        assertEquals(r1, main.addTwoNumbers(l1, k1));

        var l5 = new ListNode(9);
        var l4 = new ListNode(9, l5);
        var l3 = new ListNode(9, l4);
        var l2 = new ListNode(9, l3);
        var l1 = new ListNode(9, l2);

        var k3 = new ListNode(9);
        var k2 = new ListNode(9, k3);
        var k1 = new ListNode(9, k2);

        var r5 = new ListNode(1);
        var r4 = new ListNode(0, r5);
        var r3 = new ListNode(0, r4);
        var r2 = new ListNode(9, r3);
        var r1 = new ListNode(9, r2);
        var r0 = new ListNode(8, r1);
        assertEquals(r0, main.addTwoNumbers(l1, k1));

    }

}