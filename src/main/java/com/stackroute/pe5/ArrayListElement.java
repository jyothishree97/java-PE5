package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListElement {
    List<String> fruitlist=new ArrayList<>();


    // converting array of string to List
    public  List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            fruitlist.add(input);
        }
        return fruitlist;
    }

    public List<String> updateArray(String str) {
        for (int i = 0; i < fruitlist.size(); i++) {
            if (fruitlist.get(i).equalsIgnoreCase("Apple")) {
                fruitlist.set(i, "Kiwi");
            } else if (fruitlist.get(i).equalsIgnoreCase("Melon")) {
                fruitlist.set(i, "Mango");
            }
        }
        return fruitlist;
    }

    public  List<String> remove(){
        fruitlist.clear();
        return  fruitlist;
    }

}
