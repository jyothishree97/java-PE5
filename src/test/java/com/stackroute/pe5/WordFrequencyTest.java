package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    private static WordFrequency wordFrequency;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wordFrequency = new WordFrequency();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordFrequency = null;

    }

    @Test
    public void givenListShouldReturnTheWordCounts(){
        String str="one one -one___two,,three,one @three*one?two";
        String actual=wordFrequency.numOfWords(str);
        String expected="{one=5, two=2, three=2}";
        assertEquals(expected,actual);
    }

    @Test
    public void givenListShouldReturnTheWord(){
        String str="";
        String actual=wordFrequency.numOfWords(str);
        String expected="{=1}";
        assertEquals(expected,actual);
    }
    @Test
    public void givenEmptyListShouldReturnNull() {

        String actual = wordFrequency.numOfWords(null);
        assertNull(actual);
    }
}