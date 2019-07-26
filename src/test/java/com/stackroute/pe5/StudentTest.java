package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudent() {
        List<Student> students = new ArrayList<>();

        students.add (new Student(1, "Ajay", 27));
        students.add(new Student(2, "Raj", 29));
        students.add(new Student(3, "Simran", 37));
        students.add (new Student(4, "Ajay", 29));
        students.add(new Student(5, "ajay", 29));
        students.add (new Student(6, "Raj", 22));


        Collections.sort(students,new StudentSorter());

        // After Sorting
        String expected="[Student{id=3, name='Simran', age=37}, Student{id=2, name='Raj', age=29}, Student{id=4, name='Ajay', age=29}, Student{id=5, name='ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=6, name='Raj', age=22}]";
        assertEquals(expected, students.toString());
    }
}


