import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class CalculatorSteps {

    private Calculator calculator;
    private double firstNumber;
    private double secondNumber;
    private double result;

    @Given("^I have a calculator$")
    public void createCalculator() {
        calculator = new Calculator();
    }

    @When("^I enter the first number as \"([^\"]*)\"$")
    public void enterFirstNumber(String number) {
        firstNumber = Double.parseDouble(number);
    }

    @When("^I enter the second number as \"([^\"]*)\"$")
    public void enterSecondNumber(String number) {
        secondNumber = Double.parseDouble(number);
    }

    @When("^I choose the operation as \"([^\"]*)\"$")
    public void chooseOperation(String operation) {
       
    }

    @When("^I perform the calculation$")
    public void performCalculation() {
        result = calculator.performOperation(firstNumber, secondNumber);
    }

    @Then("^I should see the result as \"([^\"]*)\"$")
    public void verifyResult(String expected) {
        double expectedValue = Double.parseDouble(expected);
        assertEquals(expectedValue, result, 0.001);
    }

	private void assertEquals(double expectedValue, double result2, double d) {
		// TODO Auto-generated method stub
		
	}