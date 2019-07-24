package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListTest {
    private static ArrayListElement arrayListElement;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        arrayListElement = new ArrayListElement();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        arrayListElement = null;

    }

    @Test
    public void givenArraListShouldReturnArrayList() {
     String str="Apple Grape Melon Berry";
     String actual=arrayListElement.addArray(str.split(" ")).toString();
     String expected="[Apple, Grape, Melon, Berry]";
     assertEquals(expected,actual);

    }

    @Test
     public void  givenArrayListShouldReturnUpdatedArrayList() {
        String str="Apple Grape Melon Berry apple";
        String actual=arrayListElement.addArray(str.split(" ")).toString();
        String actual1=arrayListElement.updateArray("kiwi").toString();
        String expected="[Kiwi, Grape, Mango, Berry, Kiwi]";
        assertEquals(expected,actual1);
    }

    @Test
    public void  givenArrayListShouldReturnRemoveArrayElements() {
        String str="Apple Grape Melon Berry";
        String actual=arrayListElement.addArray(str.split(" ")).toString();
        String actual1=arrayListElement.remove().toString();
        String expected="[]";
        assertEquals(expected,actual1);
    }

}