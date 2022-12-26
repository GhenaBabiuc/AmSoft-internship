package com.internship.oop.company.person;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer personalCode;
    private String firstLastName;
    private Integer positionCode;
    private Integer salary;
}
