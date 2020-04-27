package wallet;

public class Teller {
    private CashSlot cashSlot;

    public Teller (CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdraw (Wallet wallet, int amount) {
        int balance = wallet.getBalance();
        if(balance == 0){
            System.out.println("Wallet balance is 0");
        } else if(amount > balance) {
            System.out.println("Not enough money in wallet");
        } else {
            cashSlot.dispense(amount);
            wallet.withdrawBalance(amount);
        }
    }
}
