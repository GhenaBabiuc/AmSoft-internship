package com.internship.oop.company.person;

public class Director extends Employee {
    private String companyName;

    public Director(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, String companyName) {
        super(personalCode, firstLastName, positionCode, salary);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
