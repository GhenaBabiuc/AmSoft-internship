package com.internship.oop.figuri;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Triangle extends Figure{
    private Double lat1;
    private Double lat2;
    private Double lat3;

    public Triangle(String color, Double lat1, Double lat2, Double lat3) {
        super(color);
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }

    @Override
    public double determinePerimeter() {
        return lat1+lat2+lat3;
    }
}
