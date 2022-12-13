package com.inrenship.oop;

import com.inrenship.oop.model.Student;
import com.inrenship.oop.service.impl.StudentServiceImpl;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Student student1 = new Student(1L,"Ion","Balti", Arrays.asList(6,8,9));
        Student student2 = new Student(2L,"Gheotghe","Chisinau", Arrays.asList(8,8,9));

        StudentServiceImpl service=new StudentServiceImpl();

        System.out.println(service.esteBursier(student1,9));
    }
}
