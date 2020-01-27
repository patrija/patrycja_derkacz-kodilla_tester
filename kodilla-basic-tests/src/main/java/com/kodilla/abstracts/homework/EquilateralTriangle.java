package com.kodilla.abstracts.homework;

import static java.lang.Math.sqrt;

public class EquilateralTriangle extends Shape {

    int x;

    public EquilateralTriangle(int x) {
        this.x = x;
    }

    @Override
    public int getCircumference() {
        return 3 * this.x;
    }

    @Override
    public int getArea() {
        return (int) (this.x*this.x*sqrt(3)/4);
    }
}
