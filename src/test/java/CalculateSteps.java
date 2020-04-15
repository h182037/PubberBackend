import backend.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculateSteps {

    private int num;
    private int budget;
    private String bar;
    private Calculator calculator = new Calculator();

    @Given("my number of bars is {string} and my budget is {string}")
    public void that_my_Calculated_bar_is(String num, String budget) {
        this.num = Integer.parseInt(num);
        this.budget = Integer.parseInt(budget);
    }

    @When("i calculate my bar")
    public void i_calculate_my_bar_now() {
        bar = calculator.calculate(true, 2, "beer", false).get(0).getName();
    }

    @Then("answer should be {string}")
    public void answer_should_be(String solution) {
        assertEquals(solution, bar);
    }
}
