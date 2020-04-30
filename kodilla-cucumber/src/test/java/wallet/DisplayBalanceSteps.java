package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);

    public DisplayBalanceSteps() {
        Given("my account has been credited with $100", () -> {
            wallet.desposit(100);
        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });


    }
}
