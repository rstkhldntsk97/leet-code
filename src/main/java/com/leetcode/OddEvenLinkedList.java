package com.leetcode;

import com.leetcode.utils.ListNode;

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode oddCur = head, evenCur = head.next, even = evenCur;
        while (evenCur != null && evenCur.next != null) {
            oddCur.next = evenCur.next;
            oddCur = oddCur.next;
            evenCur.next = oddCur.next;
            evenCur = evenCur.next;
        }
        oddCur.next = even;
        return head;
    }

}
