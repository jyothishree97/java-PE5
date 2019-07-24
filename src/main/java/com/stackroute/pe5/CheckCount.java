package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckCount {
    public String numOfChar(String str){
        //checking for null condition
        if(str==null)
            return null;

        List<String> strings = Arrays.asList(str.split(","));//spliting array

        Map<String,Boolean> map = new HashMap<String, Boolean>();//hash map used to store the values

        for (String currentString : strings) {
            System.out.printf(currentString);
            if (map.containsKey(currentString)) {
//                System.out.println(currentString);
                map.put(currentString,true);    //current string return more than 2 times return true
            } else {
//                System.out.println(currentString);
                map.put(currentString,false);   //current string return less than ones return false
            }

        }
        return map.toString();

    }
}
