package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    int r;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int getCircumference() {
        return (int) (2*Math.PI*this.r);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI*this.r*this.r);
    }
}
