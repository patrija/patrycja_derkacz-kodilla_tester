package numbers;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDividedSteps implements En {

    private int number;
    private String text;

    public IsNumberDividedSteps() {
        Given("number is tree", () -> {
            this.number = 3;

        });

        Given("number is nine", () -> {
            this.number = 9;
        });

        Given("number is twenty seven", () -> {
            this.number = 27;
        });

        Given("number is five", () -> {
            this.number = 5;
        });

        Given("number is twenty", () -> {
            this.number = 20;
        });

        Given("number is zero", () -> {
            this.number = 0;
        });

        Given("number is fifteen", () -> {
            this.number = 15;
        });

        Given("number is sixty", () -> {
            this.number = 60;
        });

        Given("number is one", () -> {
            this.number = 1;
        });

        When("I ask whether is divided by three or five", () -> {
            NumberCheck numberCheck = new NumberCheck();
            this.text = numberCheck.checkIfNumberIsDivided(this.number);

        });

        Then("I should be to told {string}", (String string) -> {
            Assert.assertEquals(this.text,string);
        });



    }
}
