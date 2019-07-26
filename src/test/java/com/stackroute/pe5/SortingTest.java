package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    private static Sorting sorting;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sorting = new Sorting();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sorting = null;

    }
    @Test
    public void givenStringArrayShouldReturnSortedArray(){
        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String str="Olive Harry Bluto Alice Eugene";
        String actual=sorting.sortingArray((str).split(" ")).toString();
        assertEquals(expected,actual);
    }

    @Test
    public void givenStringArrayShouldReturnEmptyBraces(){
        String expected="[]";
        String str="";
        String actual=sorting.sortingArray((str).split("")).toString();
        assertEquals(expected,actual);
    }

}