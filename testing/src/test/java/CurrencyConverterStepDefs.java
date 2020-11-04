import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class CurrencyConverterStepDefs {
    public CurrencyConverter currencyConverter;
    public String receiptResult;
    @Given("I have currency converter with input currency {string}, output currency {string} and exchange rate {float}")
    public void iHaveCurrencyConverter(String inputCurrency,
                                       String outputCurrency,
                                       float exchangeRate){
        currencyConverter = new CurrencyConverter(inputCurrency,
                outputCurrency, exchangeRate);
    }
    @When("I convert {float} PLN")
    public void iConvert(float inputCurrencyValue) {
        receiptResult = currencyConverter.doTransaction(inputCurrencyValue);
    }
    @Then("the receipt should be {string}")
    public void theReceiptShouldBe(String expectedResult) {
        Assert.assertEquals(expectedResult, receiptResult);
    }
}