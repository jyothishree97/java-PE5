package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ModifyKeyValue {
    public  String changeKeyValue(Map<String,String> map){

        //checking for null condtion
        if(map==null) {
            return null;

        }
        //perform swaping operation to change the key value
        Map<String,String> rev=new HashMap<String, String>();

        String temp=map.get("val1");
        map.put("val2",temp);
        map.put("val1"," ");
        return map.toString();

    }
}
