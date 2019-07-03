package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {
    Guess g;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        g=new Guess();
    }

    @After
    public void tearDown() throws Exception {
        g=null;
    }
    @Test
    public void checkGuess(){
        actualResult = g.guessTheTargetNumber(3, new int[]{1,2,3});
        expectedResult = "Number guessed matches the original number";
        assertEquals(expectedResult, actualResult);
    }
}