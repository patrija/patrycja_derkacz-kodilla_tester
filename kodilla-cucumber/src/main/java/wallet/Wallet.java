package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void desposit(int money) {
        this.balance = +money;

    }

    public int getBalance() {
        System.out.println("Your account balance is: " + this.balance);
        return this.balance;
    }

    public void withdrawBalance(int amount) {
        this.balance -= amount;
        if (this.balance < 0)
            this.balance = 0;
    }
}
