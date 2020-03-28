package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MobilePhoneTestSuite {

    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviorOfTestDouble(){
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectations(){
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication(){
        myPhone.launchApplication("Tetris 4D");
        Mockito.verify(myPhone).launchApplication("Tetris 4D");
    }
}

