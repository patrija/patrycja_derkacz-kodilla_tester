package com.kodilla.basic_assertion;

import static java.lang.Math.pow;

public class Calculator {
    int a;
    int b;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int power(int a) {
        return (int) pow(a, 2);
    }
}
