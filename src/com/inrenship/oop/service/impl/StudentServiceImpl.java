package com.inrenship.oop.service.impl;

import com.inrenship.oop.model.Student;
import com.inrenship.oop.service.StudentService;

public class StudentServiceImpl implements StudentService {
    public boolean esteBursier(Student student, int rang) {
        Integer suma=0;

        for (int i=0;i<student.getMarks().size();i++){
            suma=suma+student.getMarks().get(i);
        }

        int media=suma/student.getMarks().size();
        return media>rang;
    }
}
