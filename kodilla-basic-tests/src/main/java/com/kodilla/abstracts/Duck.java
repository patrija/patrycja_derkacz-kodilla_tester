package com.kodilla.abstracts;

public class Duck extends Animal {

    public Duck(int numbersOfLegs) {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}
