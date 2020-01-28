package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("sumowanie is OK");
        } else {
            System.out.println("sumowanie nie jest ok");
        }

        int subtractResult = calculator.subtract(a,b);
        boolean test2 = ResultChecker.assertEquals(-3, subtractResult);

        if (test2) {
            System.out.println("odejmowanie spoczko");
        } else {
            System.out.println("odejmowanie nie jest spoczko");
        }

        int powerResult = calculator.power(a);
        boolean test3 = ResultChecker.assertEquals(25, powerResult);

        if(test3) {
            System.out.println("potęgowanie jest ok");
        } else {
            System.out.println("potęgowanie nie jest ok");
        }
    }
}
