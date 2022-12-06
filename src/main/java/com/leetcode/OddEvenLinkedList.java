package com.leetcode;

import com.leetcode.utils.ListNode;

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return null;
        int counter = 1;
        var curr = head;
        ListNode odd = head;
        ListNode oddCur = odd;

        ListNode even = head.next;
        ListNode evenCur = even;

        curr = curr.next;
        while (curr != null) {
            if (counter % 2 == 0) {
                oddCur.next = curr;
                oddCur = oddCur.next;
            } else if (counter != 1 && counter % 2 == 1) {
                evenCur.next = curr;
                evenCur = evenCur.next;
            }
            counter++;
            curr = curr.next;
        }
        if (counter % 2 == 0) {
            oddCur.next = null;
        } else if (counter % 2 == 1) {
            evenCur.next = null;
        }
        oddCur.next = even;
        return head;
    }

}
