package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
       // PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        assertFalse(result);
        checker.incrementCount();
        System.out.println("count: " + checker.getCount());
        count++;
        System.out.println("test nunmber: " + count);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
       // PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        assertTrue(result);
        checker.incrementCount();
        System.out.println("count: " + checker.getCount());
        count++;
        System.out.println("test number: " + count);
    }

    @Test
    public void shouldReturnTrueWhenPassingNumberTwo() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        assertTrue(result);
        checker.incrementCount();
        System.out.println("count: " + checker.getCount());
    }

    @Test
    public void shouldReturnFalseWhenPassingNumberOne() {
       // PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        assertFalse(result);
        checker.incrementCount();
        System.out.println("count " + checker.getCount());
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        assertFalse(result);
        checker.incrementCount();
        System.out.println("count: " + checker.getCount());
    }

    @Test
    public void shouldReturnFalseWhenPassingMinusNumber(){
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        System.out.println("count: " + checker.getCount());
        assertFalse(result);
    }
}

