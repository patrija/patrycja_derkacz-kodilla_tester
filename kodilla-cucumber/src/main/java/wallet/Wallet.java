package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void desposit(int money) {
        this.balance =+ money;

    }
    public int getBalance() {
        return this.balance;
    }

    public void withdrawBalance(int amount) {
        this.balance -= amount;
        if(this.balance < 0)
            this.balance =0;
    }
}
