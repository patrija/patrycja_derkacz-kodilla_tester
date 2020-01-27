package com.kodilla.abstracts;

public class Dog extends Animal {

    public Dog(int numbersOfLegs) {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}
