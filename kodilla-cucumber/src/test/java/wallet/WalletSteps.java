package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.desposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I requested $30", () -> {
            teller.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });


        Given("I have deposited $400 in my wallet", () -> {
            wallet.desposit(400);
            Assert.assertEquals(400, wallet.getBalance());
        });

        When("I requested $500", () -> {
            teller.withdraw(wallet, 500);
        });

        Then("I should get balance $400", () -> {
            Assert.assertEquals(400, wallet.getBalance());
        });

        Given("I have deposited $0", () -> {
            wallet.desposit(0);
        });

        When("I have requested $50", () -> {
            teller.withdraw(wallet,50);
        });

        Then("I should get balance $0\"", () -> {
        Assert.assertEquals(0, wallet.getBalance());

        });

        Given("I have deposited $500 in my wallet", () -> {
            wallet.desposit(500);
        });

        When("I have requested $500", () -> {
            teller.withdraw(wallet, 500);
            Assert.assertEquals(0,wallet.getBalance());
        });

        Then("$500 should be dispensed", () -> {
           Assert.assertEquals(500, cashSlot.getContents());
        });




    }
}
