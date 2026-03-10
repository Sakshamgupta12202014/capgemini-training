package com.capg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5_Test2_LifeCycle {

    @BeforeEach
    void setUp() {
        System.out.println("Before each test");
    }

    @Test
    void testOne() {
        assertTrue(10 > 5);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }
}