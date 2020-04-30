package wallet;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        int balance = wallet.getBalance();
        if (balance == 0) {
            System.out.println("Wallet balance is 0");
        } else if (amount > balance) {
            System.out.println("You have insufficient funds in your account");
        } else {
            cashSlot.dispense(amount);
            wallet.withdrawBalance(amount);
        }
    }


}
