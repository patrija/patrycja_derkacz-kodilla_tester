package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {

    @Test
    public void shouldGetBalance(){
        CashMachine cashMachine = new CashMachine(new double[]{100.0, 500.0,-50.0});
        double balance = cashMachine.getBalance();
        assertEquals(550, balance);
    }


    @Test
    public void shouldGetBalanceIfTransactionIsEmpty(){
        CashMachine cashMachine = new CashMachine(new double[]{});
        double balance = cashMachine.getBalance();
        assertEquals(0,balance);
    }

    @Test
    public void shouldGetNumberOfTransaction(){
        CashMachine cashMachine = new CashMachine(new double[]{100,-20,50,300});
        int numberOfTransaction = cashMachine.numberOfTransaction();
        assertEquals(4, numberOfTransaction);
    }



}