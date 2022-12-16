package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsing2StacksTest {

    private final QueueUsing2Stacks main = new QueueUsing2Stacks();

    @Test
    void testQueueImpl() {
        assertTrue(main.empty());
        main.push(1);
        assertFalse(main.empty());
        main.push(2);
        main.push(3);
        assertEquals(1, main.peek());
        assertEquals(1, main.pop());
        assertFalse(main.empty());
        main.push(4);
        assertEquals(2, main.peek());
        assertEquals(2, main.pop());
    }

}