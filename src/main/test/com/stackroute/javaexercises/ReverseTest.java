package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse r;

    @Before
    public void setUp() throws Exception {
        r=new Reverse();
    }

    @After
    public void tearDown() throws Exception {
        r=null;
    }
    @Test
    public void testReverse()
    {
        String rev=r.reverse("mrudu");
        assertEquals("udurm",rev);
    }
    @Test
    public void testNegative()
    {
        String rev=r.reverse("mrudu");
        assertEquals("mrudu",rev);
    }
}