package com.kodilla.parametrized_tests.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GamblingMachineTestSuite {
    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = {"/numbersForGamblingMachine.csv"}, delimiter = '.')
    public void gamblingMachineShouldNotThrowException(String number) throws InvalidNumbersException {
        //Given
        Set<Integer> numbers =
                Stream.of(number.split(","))
                        .map(Integer::valueOf)
                        .collect(Collectors.toSet());
        //When
        int result = machine.howManyWins(numbers);
        //Then
        Assertions.assertNotNull(result);
    }

    @Test(expected = InvalidNumbersException.class)
    public void shouldThrowExceptionWhenNumberSizeIsDifferentThanSix() throws InvalidNumbersException {
        //Given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(30);
        numbers.add(5);
        numbers.add(26);

        //When
        machine.howManyWins(numbers);
    }

    @Test(expected = InvalidNumbersException.class)
    public void shouldThrowExceptionWhenNumberIsLowerThanOne() throws InvalidNumbersException {
        // Given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(30);
        numbers.add(5);
        numbers.add(26);
        numbers.add(0);

        //When
        machine.howManyWins(numbers);
    }

    @Test(expected = InvalidNumbersException.class)
    public void shouldThrowExceptionWhenNumbersIsNull() throws InvalidNumbersException {
        //Given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(null);

        //When
        machine.howManyWins(numbers);
    }

}
