package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop l;

    @Before
    public void setUp() throws Exception {
        l = new Loop();
    }

    @After
    public void tearDown() throws Exception {
        l = null;
    }

    @Test
    public void givenNumbershouldDisplayLoop() {
        String result = l.printLoop(2);
        assertEquals("122", result);
    }

    @Test
    public void givenNumberShouldDisplay() {
        String result = l.printLoop(5);
        assertEquals("122333444455555", result);


    }
}