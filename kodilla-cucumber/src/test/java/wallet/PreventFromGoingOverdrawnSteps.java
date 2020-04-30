package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventFromGoingOverdrawnSteps implements En {

    private Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);

    public PreventFromGoingOverdrawnSteps() {
        Given("my wallet has been credited with $100", () -> {
            wallet.desposit(100);
        });

        When("I withdraw $200", () -> {

            teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            int balance = wallet.getBalance();
            Assert.assertEquals(100, balance);
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            int balance = wallet.getBalance();
            Assert.assertEquals(100, balance);

        });
    }
}
