package com.internship.oop.figuri;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Circle extends Figure{
    private Double radius;

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double determinePerimeter() {
        return 2*Math.PI*radius;
    }
}
