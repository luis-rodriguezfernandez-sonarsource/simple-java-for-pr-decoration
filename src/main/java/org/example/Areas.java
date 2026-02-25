package org.example;

public class Areas {
    // Area of a square: side * side
    public static double square(double side) {
        return side * side;
    }

    // Area of a circle: pi * radius^2
    public static double circle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a triangle: 0.5 * base * height
    public static double triangle(double base, double height) {
        return 0.5 * base * height;
    }
}