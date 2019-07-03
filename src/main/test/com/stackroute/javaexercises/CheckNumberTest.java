package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberTest {
    CheckNumber cn;

    @Before
    public void setUp() throws Exception {
        cn=new CheckNumber();
    }

    @After
    public void tearDown() throws Exception {
        cn=null;
    }
    @Test
    public void  checkTomOrJerry(){
        String res=cn.check(20);
        assertEquals("Jerry",res);
    }

    @Test
    public void checkNumberIsNegative() {
        String result = cn.check(-25);
        assertEquals("number is not correct", result);
    }
    @Test
    public void checkNumberIsNotCorrect() {
        String result = cn.check('@');
        assertEquals("number is not correct", result);
    }
}