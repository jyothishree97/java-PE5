package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

    public String numOfWords(String str) {

        //checking if given input is null
        if (str == null)
            return null;

        List<String> string = Arrays.asList(str.split("[\\W_]+"));


        //hashmap to store the frequencies of words

        Map<String,Integer> map = new HashMap<>();

        for (String str1 : string) {
            if (map.containsKey(str1)) {
                map.replace(str1,map.get(str1)+1);
//                System.out.printf(str1);

            } else {
                map.put(str1,1);
            }
        }
        return map.toString();
    }
}
