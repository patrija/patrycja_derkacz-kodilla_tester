package com.kodilla.abstracts.homework;

public class Aplication {
    public static void main(String[] args) {

        Shape equilateralTriangle = new EquilateralTriangle(3);

        System.out.println(equilateralTriangle.getArea());
        System.out.println(equilateralTriangle.getCircumference());

        Shape square = new Square(3);

        System.out.println(square.getArea());
        System.out.println(square.getCircumference());

        Shape circle = new Circle(3);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());



    }
}
