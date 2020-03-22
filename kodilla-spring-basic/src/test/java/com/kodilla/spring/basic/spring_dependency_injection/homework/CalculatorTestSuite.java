package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectValueOfAdd(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double resultOfAdd = bean.add(5.0, 4.0);

        Assertions.assertEquals(9.0, resultOfAdd);
    }

    @Test
    public void shouldReturnCorrectValueOfSubtract(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double resultOfSubtract = bean.subtract(5.0, 4.0);

        Assertions.assertEquals(1.0, resultOfSubtract);
    }

    @Test
    public void shouldReturnCorrectValueOfMultiply(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double resultOfMultiply = bean.multiply(5.0, 4.0);

        Assertions.assertEquals(20.0, resultOfMultiply);
    }
    @Test
    public void shouldReturnCorrectValueOfDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);

        double resultOfDivide = bean.divide(5.0, 1.0);

        Assertions.assertEquals(5.0, resultOfDivide);
    }
}
