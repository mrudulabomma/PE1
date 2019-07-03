package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class InputTest {
    Input i;

    @Before
    public void setUp() throws Exception {
        i=new Input();
    }

    @After
    public void tearDown() throws Exception {
        i=null;
    }
    @Test
    public void checkInput()
    {
        String s=i.checkGivenInput('A');
        assertEquals("A is capital letter",s);
    }
    @Test
    public void checkTheSymbolInputCharacter() {
       String actualResult = i.checkGivenInput('@');
       String expectedResult = "Special Symbol";
        assertEquals(expectedResult, actualResult);
    }
}