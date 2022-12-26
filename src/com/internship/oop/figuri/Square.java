package com.internship.oop.figuri;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Square  extends Figure{
    private Double lat;

    public Square(String color, Double lat) {
        super(color);
        this.lat = lat;
    }

    @Override
    public double determinePerimeter() {
        return lat*4;
    }
}
