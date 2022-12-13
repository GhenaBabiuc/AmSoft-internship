package com.inrenship.oop.model;

import java.util.List;

public class Student extends Person{
    private List<Integer> marks;

    public Student(long id, String name, String adress, List<Integer> marks) {
        super(id, name, adress);
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}
