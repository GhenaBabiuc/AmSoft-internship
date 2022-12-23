package com.internship.oop.company.person;

public class Programmer extends Employee{
    private String programmingLanguage;

    public Programmer(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, String programmingLanguage) {
        super(personalCode, firstLastName, positionCode, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
