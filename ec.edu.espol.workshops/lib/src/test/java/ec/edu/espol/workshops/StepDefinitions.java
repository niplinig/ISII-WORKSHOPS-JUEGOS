package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefinitions {
    int actualAnswer;
    char sex;
    boolean isMarried;
    int licenseNumber;
    int age;
    
    @Given("Is the customer is a {string}")
    public void the_customer_is_male(String value) {
        sex = value.charAt(0);
    }
    
    @Given("Is {int} years old")
    public void the_customer_is(Integer value) {
        age = value.intValue();
    }
    
    @Given("Is married {string}")
    public void the_customer_is_married(String value) {
        isMarried = value.equals("y");
    }
    
    @Given("Has license number {int}")
    public void the_customer_license_number(Integer value) {
        licenseNumber = value.intValue();
    }
    
    @When("Calculate the insurance")
    public void calculate_the_insurance() {
        Customer customer = new Customer(age, sex, isMarried, licenseNumber);
        actualAnswer = Calculator.calCarIns(customer);
    }
    
    @Then("The insurance will cost {int}")
    public void the_insurance_will_cost(Integer expectedAnswer) {
        assertEquals(expectedAnswer.intValue(), actualAnswer);
    }
}