package com.internship.oop.model;

import java.util.List;

public class Teacher extends Person{
    private List<String> courses;

    public Teacher(long id, String name, String adress, List<String> courses) {
        super(id, name, adress);
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
