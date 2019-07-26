package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {

        //It checks the age of two student is same
    if (student.getAge() == t1.getAge()) {
       //It checks 2 students have same name then sort based on their name.
        if (student.getName().equals(t1.getName()))
            return t1.getId() - student.getId();
        else
            return t1.getName().compareToIgnoreCase(student.getName());
       }
    else {
        return t1.getAge() - student.getAge();
    }
  }
}