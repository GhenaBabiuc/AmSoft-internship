package com.internship.oop.company.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Director extends Employee {
    private String companyName;

    public Director(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, String companyName) {
        super(personalCode, firstLastName, positionCode, salary);
        this.companyName = companyName;
    }
}
