package com.internship.oop.company.person;

public class Manager extends Employee{
    private Integer numberOfTeamMembers;

    public Manager(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, Integer numberOfTeamMembers) {
        super(personalCode, firstLastName, positionCode, salary);
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public Integer getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }

    public void setNumberOfTeamMembers(Integer numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }
}
