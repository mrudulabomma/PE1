package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckLetterTest {
    CheckLetter cl;

    @Before
    public void setUp() throws Exception {
        cl=new CheckLetter();
    }

    @After
    public void tearDown() throws Exception {
        cl=null;
    }
    @Test
    public void givenStringVowelOrConsonet(){
String str=cl.check("ap");
        assertEquals("vowelconsonent",str);

    }
    @Test
    public  void checkLetterIsVowel() {
        String result= cl.check("A");
        assertEquals("vowel",result);

    }
    @Test
    public  void checkLetterIsConsonant() {
        String result= cl.check("b");
        assertEquals("consonent",result);

    }
}