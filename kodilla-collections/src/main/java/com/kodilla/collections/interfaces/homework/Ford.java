package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {


    private int speedUp;
    private int speedDown;
    private int actualSpeed;

    public Ford(int speedUp, int speedDown, int actualSpeed) {
        this.speedUp = speedUp;
        this.speedDown = speedDown;
        this.actualSpeed = actualSpeed;
    }


    @Override
    public void increaseSpeed() {
        this.actualSpeed =this.actualSpeed + this.speedUp;
        System.out.println(this.actualSpeed);
    }

    @Override
    public void decreaseSpeed() {
       actualSpeed= actualSpeed-speedDown;
        System.out.println(actualSpeed);
    }

    @Override
    public int getSpeed() {
        return actualSpeed;
    }
}
