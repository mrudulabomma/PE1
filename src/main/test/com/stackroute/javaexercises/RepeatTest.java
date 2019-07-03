package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatTest {
    Repeat r;

    @Before
    public void setUp() throws Exception {
        r=new Repeat();
    }

    @After
    public void tearDown() throws Exception {
        r=null;
    }
    @Test
    public void checkRepeat(){
        String res=r.finalOutputString("goal",2);
        assertEquals("goalalal",res);
    }
}