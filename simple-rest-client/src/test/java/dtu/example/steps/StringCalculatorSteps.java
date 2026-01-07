package dtu.example.steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorSteps {
    private StringCalculator calculator;

    @Given("that the String Calculator is initialized")
    public void thatTheStringCalculatorIsInitialized() {
        calculator = new StringCalculator();
  ;  }

    @When("I input the string {string}")
    public void iInputTheString(String inputString) {
        calculator.add(inputString);
    }

    @Then("the result should show {double}")
    public void theResultShouldBe(Double expectedResult) {
        assertEquals(expectedResult, calculator.getResult());
    }
}
