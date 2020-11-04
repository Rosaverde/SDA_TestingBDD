import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class CalculatorStepDefs {
    private Calculator calculator;
    private float result;
    private String errorMessage;
    @Given("I have a calculator")
    public void iHaveCalculator() {
        calculator = new Calculator();
    }
    @When("I divide {float} by {float}")
    public void iDivideTwoNumbers(float n1, float n2) {
        try {

            result = calculator.divide(n1, n2);
        } catch (IllegalArgumentException exception) {

            errorMessage = exception.getMessage();
        }
    }
    @Then("the result should be {float}")
    public void theResultShouldBe(float scenarioResult) {
        Assert.assertEquals(scenarioResult, result, 0.0f);
    }
    @Then("the error message {string} should appear")
    public void theErrorMessageShouldAppear(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, errorMessage);
    }
}