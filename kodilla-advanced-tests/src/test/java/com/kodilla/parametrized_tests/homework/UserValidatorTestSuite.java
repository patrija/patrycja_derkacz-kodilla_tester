package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"JDK7\n", "jdk1617\n", "718\n", "._-\n", "pD4\n", "KKKK\n"})
    public void  checkIfUsernameIsCorrectWithExpectedValues(String user){
        //System.out.println(user);
        boolean result = userValidator.validateUsername(user);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"A.\n", "jdk16117", "pD 4\n", "\n", "Jdk7%\n"})
    public void checkIfUsernameIsNotCorrectWithNotExpectedValues(String user){
      boolean result = userValidator.validateUsername(user);

      assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"joanna.nowak@poczta.interia.pl", "joanna.nowak.kowalska@poczta.interia.pl", "_joanna@poczta.pl", "", "_@-.pl", "1@2.p"})

    public void checkIfEmailIsValidateWithCorrectValues(String email) {

        boolean result = userValidator.validateEmail(email);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"joanna.poczta.pl", "joanna.@poczta.pl", " ", "joanna@poczta.2", "joanna@.poczta.plplplpl"})

    public void checkIfEmailIsValidateWithNotCorrectValues(String email) {

        boolean result = userValidator.validateEmail(email);

        assertFalse(result);
    }

}