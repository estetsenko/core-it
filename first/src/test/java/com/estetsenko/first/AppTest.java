package com.estetsenko.first;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addFirst() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void mulFirst() {
        assertEquals(6, App.mul(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void alwaysSuccessFirst() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void alwaysFailFirst() {
        fail();
    }
}