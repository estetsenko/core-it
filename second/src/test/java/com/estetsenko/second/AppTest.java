package com.estetsenko.second;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addSecond() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void mulSecond() {
        assertEquals(6, App.mul(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void alwaysSuccessSecond() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void alwaysFailSecond() {
        fail();
    }
}