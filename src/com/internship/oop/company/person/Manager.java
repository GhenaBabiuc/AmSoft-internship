package com.internship.oop.company.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Manager extends Employee{
    private Integer numberOfTeamMembers;

    public Manager(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, Integer numberOfTeamMembers) {
        super(personalCode, firstLastName, positionCode, salary);
        this.numberOfTeamMembers = numberOfTeamMembers;
    }
}
