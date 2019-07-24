package com.stackroute.pe5;

import java.util.*;

public class Sorting {
    public List<String> sortingArray(String[] str){

       //Checking for null or no string option
        if(str==null)
            return null;

//        List<String> str1= Arrays.asList(str.split(" ")).toString();


        HashSet<String> set=new HashSet<String>();

       //adding elements to set
        for(String string : str){
//            System.out.printf(string);
            set.add(string);
//            System.out.printf(string);
        }
//     collections.sort() directly can't applied to set so we need it convert to list

        List<String> list = new ArrayList<>(set);
        //elements are sorted
        Collections.sort(list);
        return  list;
    }
}
