package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework2.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#BMISource")
    public void shouldReturnBMIInformation(Person person, String expected) {
        Assertions.assertEquals(person.getBMI(), expected);
    }
}

