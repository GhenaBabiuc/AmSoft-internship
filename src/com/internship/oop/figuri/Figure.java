package com.internship.oop.figuri;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double determinePerimeter();
}
