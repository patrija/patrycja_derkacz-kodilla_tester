package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalBalance() {
        double sum = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public double getNumbersOfTransactionsOfWithdraw() {
        int licznik = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            for(int n = 0; n < cashMachines[i].getTransactions().length; n++) {
                double[] temp = cashMachines[i].getTransactions();
                if (temp[n] < 0) {
                    licznik++;
                }
            }
        }
        return licznik;
    }

    public double getNumberOfTransactionsOfPayment() {
        int licznik = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            for(int n = 0; n < cashMachines[i].getTransactions().length; n++) {
                double[] temp = cashMachines[i].getTransactions();
                if (temp[n] > 0) {
                    licznik++;
                }
            }
        }
        return licznik;
    }

    public double getAverageWithdrawn() {
        int licznik = 0;
        double sum = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            for(int n = 0; n < cashMachines[i].getTransactions().length; n++) {
                double[] temp = cashMachines[i].getTransactions();
                if (temp[n] < 0) {
                    licznik++;
                    sum = sum + temp[n];
                }
            }
        }
        return sum / licznik;
    }

    public double getAveragePayment() {
        int licznik = 0;
        double sum = 0;
        for(int i = 0; i < cashMachines.length; i++) {
            for (int n = 0; n < cashMachines[i].getTransactions().length; n++) {
                double[] temp = cashMachines[i].getTransactions();
                if (temp[n] > 0) {
                    licznik++;
                    sum = sum + temp[n];
                }
            }
        }
        return sum / licznik;
    }
}
