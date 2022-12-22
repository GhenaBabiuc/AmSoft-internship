package com.internship.oop.model;

public class Person {
    private long id;
    private String name;
    private String adress;

    public Person(long id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
