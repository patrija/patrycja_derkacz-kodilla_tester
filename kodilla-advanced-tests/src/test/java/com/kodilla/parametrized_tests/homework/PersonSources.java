package com.kodilla.parametrized_tests.homework;


import com.kodilla.parametrized_tests.homework2.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> BMISource() {
        Person person = new Person(1.6, 35);
        Person person1 = new Person(1.6, 40);
        Person person2 = new Person(1.6, 45);
        Person person3 = new Person(1.78, 65);
        Person person4 = new Person(1.78, 85);
        Person person5 = new Person(1.6, 88);
        Person person6 = new Person(1.6, 102);
        Person person7 = new Person(1.6, 112);
        Person person8 = new Person(1.5, 110);
        Person person9 = new Person(1.5, 130);
        Person person10 = new Person(1.5, 140);

        return Stream.of(

                Arguments.of(person, "Very severely underweight"),
                Arguments.of(person1, "Severely underweight"),
                Arguments.of(person2, "Underweight"),
                Arguments.of(person3, "Normal (healthy weight)"),
                Arguments.of(person4, "Overweight"),
                Arguments.of(person5, "Obese Class I (Moderately obese)"),
                Arguments.of(person6, "Obese Class II (Severely obese)"),
                Arguments.of(person7, "Obese Class III (Very severely obese)"),
                Arguments.of(person8, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(person9, "Obese Class V (Super Obese)"),
                Arguments.of(person10, "Obese Class VI (Hyper Obese)")
        );
    }
}

