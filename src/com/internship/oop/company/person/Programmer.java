package com.internship.oop.company.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Programmer extends Employee{
    private String programmingLanguage;

    public Programmer(Integer personalCode, String firstLastName, Integer positionCode, Integer salary, String programmingLanguage) {
        super(personalCode, firstLastName, positionCode, salary);
        this.programmingLanguage = programmingLanguage;
    }
}
