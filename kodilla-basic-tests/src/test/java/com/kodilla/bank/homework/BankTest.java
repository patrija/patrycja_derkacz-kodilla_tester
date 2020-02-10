package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    public void shouldGetTotalBalance() {
        CashMachine cashMachine1 = new CashMachine(new double[]{100, 500, -50});
        CashMachine cashMachine2 = new CashMachine(new double[]{100, -20, 50, 300});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double totalBalance = bank.getTotalBalance();
        assertEquals(980, totalBalance);
    }

    @Test
    public void shouldGetTotalBalanceIfAllTransactionsAreWithdrawn() {
        CashMachine cashMachine1 = new CashMachine(new double[]{-100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{-100, -200});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double totalBalance = bank.getTotalBalance();
        assertEquals(-900, totalBalance);
    }

    @Test
    public void shouldGetAverageWithdrawn() {
        CashMachine cashMachine1 = new CashMachine(new double[]{-100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{-100, -200});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double averageWithdrawn = bank.getAverageWithdrawn();
        assertEquals(-225, averageWithdrawn);
    }

    @Test
    public void shouldGetAverageWithdrawnIfExistPayment() {
        CashMachine cashMachine1 = new CashMachine(new double[]{100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{-100, -200, -400});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double averageWithdrawn = bank.getAverageWithdrawn();
        assertEquals(-300, averageWithdrawn);
    }

    @Test
    public void shouldGetAveragePayment() {
        CashMachine cashMachine1 = new CashMachine(new double[]{100, 500});
        CashMachine cashMachine2 = new CashMachine(new double[]{100, 200});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double averagePayment = bank.getAveragePayment();
        assertEquals(225, averagePayment);
    }


    @Test
    public void shouldGetAveragePaymentIfExistWithdraw() {
        CashMachine cashMachine1 = new CashMachine(new double[]{100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{100, 200, 400});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double averagePayment = bank.getAveragePayment();
        assertEquals(200, averagePayment);
    }

    @Test
    public void shouldGetNumbersOfTransactionsOfWithdrawMoney(){
        CashMachine cashMachine1 = new CashMachine(new double[]{100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{100, 200, 400});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double numberOfTransaction = bank.getNumbersOfTransactionsOfWithdraw();
        assertEquals(1, numberOfTransaction);
    }

    @Test
    public void shouldGetNumbersOfTransactionsOfWithdrawMoneyWithCashMachineWithNoTransactions(){
        CashMachine cashMachine1 = new CashMachine(new double[]{100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double numberOfTransaction = bank.getNumbersOfTransactionsOfWithdraw();
        assertEquals(1, numberOfTransaction);
    }

    @Test
    public void shouldGetNumbersOfTransactionsOfPayment(){
        CashMachine cashMachine1 = new CashMachine(new double[]{100, -500});
        CashMachine cashMachine2 = new CashMachine(new double[]{100, 200, 400});
        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        double numberOfTransaction = bank.getNumberOfTransactionsOfPayment();
        assertEquals(4, numberOfTransaction);
    }
}


