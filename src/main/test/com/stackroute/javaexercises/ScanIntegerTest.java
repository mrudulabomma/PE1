package com.stackroute.javaexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScanIntegerTest {
    ScanInteger si;

    @Before
    public void setUp() throws Exception {
        si=new ScanInteger();
    }

    @After
    public void tearDown() throws Exception {
        si=null;
    }
    @Test
    public void checkScanInteger(){
        int res=si.scanUnspecifiedArgumentsOfIntegersAndPrintSum(new int[]{1,2,3});
        assertEquals(6,res);
    }

}