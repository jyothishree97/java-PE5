package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCountTest {

    private static CheckCount checkCount;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        checkCount = new CheckCount();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        checkCount = null;

    }


    @Test
    public void givenInputShouldReturnStringAndBooleanValue() {
        String str = "a,b,c,d,a,c,c";
        String actual = checkCount.numOfChar(str);
        String expected = "{a=true, b=false, c=true, d=false}";
        assertEquals(expected, actual);
    }

    @Test
    public void givenInputShouldReturnStringNull(){
        String actual=checkCount.numOfChar("");
        String expected="{=false}";
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputShouldReturnStringAndFalse() {
        String str = "a,b,c,d, ";
        String actual = checkCount.numOfChar(str);
        String expected = "{ =false, a=false, b=false, c=false, d=false}";
        assertEquals(expected, actual);
    }

}