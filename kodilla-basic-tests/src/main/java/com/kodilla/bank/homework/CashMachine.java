package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public double getBalance(){
        double sum = 0;
        for(int i =0; i < transactions.length; i++){
            sum = sum + transactions[i];
        }
        return sum;
    }

    public int numberOfTransaction(){
        return transactions.length;
    }

    public double[] getTransactions() {
        return transactions;
    }
}
