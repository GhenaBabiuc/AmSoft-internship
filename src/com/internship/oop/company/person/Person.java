package com.internship.oop.company.person;

public class Person extends PositionCode {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int positionCode, String attribute, int salary) {
        super(positionCode, attribute);
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
