package com.stackroute.pe5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValueTest {

    private static ModifyKeyValue modifyKeyValue;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        modifyKeyValue = new ModifyKeyValue();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        modifyKeyValue = null;

    }

    @Test
    public void givenInputShouldReturnUpdatedKeyValues(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("val1","java");
        map.put("val2","c++");
        String expected="{val2=java, val1= }";
        String actual=modifyKeyValue.changeKeyValue(map);
        assertEquals(expected,actual);
    }

    @Test
    public void givenInputShouldReturnUpdatedKeyValue(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String expected="{val2=mars, val1= }";
        String actual=modifyKeyValue.changeKeyValue(map);
        assertEquals(expected,actual);
    }



}