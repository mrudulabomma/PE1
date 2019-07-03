package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    String actualResult;
    String expectedResult;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {


    palindrome=null;
}
    @Test
    public void checkWhetherTheSumIsLess() {
        actualResult = palindrome.isPalindrome("2468642");
        expectedResult = "String is palindrome and sum of even numbers is greater than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheSumIsGreater() {
        actualResult = palindrome.isPalindrome("123454321");
        expectedResult = "String is palindrome and sum of even numbers is less than 25";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheStringIsPalindrome() {
        actualResult = palindrome.isPalindrome("1234");
        expectedResult = "String is not palindrome";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheInputIsNumberOrNot() {
        actualResult = palindrome.isPalindrome("aba");
        expectedResult = "Input is not valid";
        assertEquals(expectedResult, actualResult);
    }

}