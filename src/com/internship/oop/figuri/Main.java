package com.internship.oop.figuri;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String figure, color;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter figure");
        figure = cin.next().toUpperCase();
        System.out.println("Enter color");
        color = cin.next();
        switch (figure) {
            case "TRIANGLE" -> {
                double lat1, lat2, lat3;
                System.out.println("Insert side 1");
                lat1 = cin.nextDouble();
                System.out.println("Insert side 2");
                lat2 = cin.nextDouble();
                System.out.println("Insert side 3");
                lat3 = cin.nextDouble();
                Triangle t = new Triangle(color, lat1, lat2, lat3);
                System.out.println(figure.toLowerCase() + " " + t.getColor().toLowerCase() + " " + t.determinePerimeter());
            }
            case "CIRCLE" -> {
                double radius;
                System.out.println("Enter radius");
                radius = cin.nextDouble();
                Circle t = new Circle(color, radius);
                System.out.println(figure.toLowerCase() + " " + t.getColor().toLowerCase() + " " + t.determinePerimeter());
            }
            case "SQUARE" -> {
                double lat;
                System.out.println("Insert side");
                lat = cin.nextDouble();
                Square t = new Square(color, lat);
                System.out.println(figure.toLowerCase() + " " + t.getColor().toLowerCase() + " " + t.determinePerimeter());
            }
        }
    }
}
