package com.kodilla.abstracts;

public abstract class Animal {
    private int  numbersOfLegs;

    public Animal(int numbersOfLegs) {
        this.numbersOfLegs = numbersOfLegs;
    }

    public int getNumbersOfLegs() {
        return numbersOfLegs;
    }

    public abstract void giveVoice();
}
