package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KeysAndRoomsTest {

    KeysAndRooms main = new KeysAndRooms();

    @Test
    void canVisitAllRooms() {
        assertTrue(main.canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of())));
        assertFalse(main.canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
    }

}