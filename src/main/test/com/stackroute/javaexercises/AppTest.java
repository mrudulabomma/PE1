package com.stackroute.javaexercises;
import org.junit.*;

import static org.junit.Assert.*;
public class AppTest {
    App obj;
    @Before
    public void setUp() throws Exception{
        System.out.println("Before");
        obj=new App();

    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Beforeclass");


    }
    @After
    public void tearDown() throws Exception{
        System.out.println("after");
        obj=null;
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("afterclass");

    }
    @Test
    public void givenTwoStringShouldReturnConcatenatedUpperString(){
        //arrange

        //act

        String result= obj.concatAndConvertString("hello","world");
        //assert
        assertEquals("HELLOWORLD",result);

    }
    @Test
    public void givenTwoNullShouldReturnErrorMessage(){

        String res=obj.concatAndConvertString(null,null);
        assertEquals("Null not allowed",res);
    }
    @Test
    public void givenOneEmptyStringOneNumericStringShouldReturnNumericString(){

        String res=obj.concatAndConvertString("","5");
        assertEquals("5",res);
    }
}

