package com.estetsenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void mul() {
        assertEquals(6, App.mul(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void alwaysFail() {
        assertFalse(true);
    }
}