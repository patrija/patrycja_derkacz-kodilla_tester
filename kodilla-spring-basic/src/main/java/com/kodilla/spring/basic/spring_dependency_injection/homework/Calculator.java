package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){

        double resultOfAdd = a + b;
        display.display(resultOfAdd);
        return resultOfAdd;
    }

    public double subtract(double a, double b) {

        double resultOfSubtract = a - b;
        display.display(resultOfSubtract);
        return resultOfSubtract;
    }

    public double multiply(double a, double b) {

        double resultOfMultiply = a * b;
        display.display(resultOfMultiply);
        return resultOfMultiply;
    }

    public double divide(double a, double b){

        double resultOfDivide = a / b;
        if(b != 0) {
            display.display(resultOfDivide);
        }
        return resultOfDivide;
    }
}
