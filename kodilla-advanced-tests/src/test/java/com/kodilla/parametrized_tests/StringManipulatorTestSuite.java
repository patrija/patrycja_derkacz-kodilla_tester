package com.kodilla.parametrized_tests;
/*
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
   // @CsvSource(value = {"test, tset", "otHer, rehto", "eVent, tneve", "null, llun", "A, a"})1
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReturnStringWithLowerCase(String input, String expected){
        System.out.println(manipulator.reverseWithLowerCase(input));

        System.out.println(manipulator.reverseWithLowerCase(expected));

        assertEquals(expected,manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpace(String input, int expected){

        System.out.println(manipulator.getStringLengthWithoutSpaces(input));

        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

*/
/*
    private static Stream<Arguments> provideStringForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("otHer", 5),
                Arguments.of("EVent", 5),
                Arguments.of("null", 4),
                Arguments.of("A", 1)
        );
    }
*/
    /*
    @ParameterizedTest
    @MethodSource(value = "provideStringForTestingLength")
    public void shouldCalculateStringLengthWithoutSpace(String input, int expected){

        System.out.println(manipulator.getStringLengthWithoutSpaces(input));

        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }


    @ParameterizedTest
    @MethodSource
    public void shouldCalculateStringLengthWithoutSpace(String input, int expected){

        System.out.println(manipulator.getStringLengthWithoutSpaces(input));

        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    private static Stream<Arguments> shouldCalculateStringLengthWithoutSpace() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("otHer", 5),
                Arguments.of("EVent", 5),
                Arguments.of("null", 4),
                Arguments.of("A", 1)
        );
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        System.out.println(manipulator.countNumberOfCommas(input));
        assertEquals(expected,manipulator.countNumberOfCommas(input));
    }
    */
    /*
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

*/

/*
    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }



}
*/