package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;
    public Square(int a){
        this.a = a;
    }

    @Override
    public int getCircumference() {
        return 4*this.a;
    }

    @Override
    public int getArea() {
        return this.a*this.a;
    }
}
