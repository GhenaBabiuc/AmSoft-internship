package com.internship.oop.company.person;

public class Employee {
    private Integer personalCode;
    private String firstLastName;
    private Integer positionCode;
    private Integer salary;

    public Employee(Integer personalCode, String firstLastName, Integer positionCode, Integer salary) {
        this.personalCode = personalCode;
        this.firstLastName = firstLastName;
        this.positionCode = positionCode;
        this.salary = salary;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(Integer personalCode) {
        this.personalCode = personalCode;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public Integer getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(Integer positionCode) {
        this.positionCode = positionCode;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
