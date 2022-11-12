package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
    private CarInsurance actualAnswer;
    char sex;
    boolean isMarried;
    String licenseNumber;
    int age;
    
    @Given("Is the customer is a {string}")
    public void the_customer_is_male(String value) {
        sex = value.charAt(0) ;
    }
    
    @Given("Is {string} years old")
    public void the_customer_is(String value) {
        age = Integer.valueOf(value);
    }
    
    @Given("Is {string}")
    public void the_customer_is_married(String value) {
        isMarried = value == "y";
    }
    
    @Given("Has license number {string}")
    public void the_customer_license_number(String value) {
        licenseNumber = value;
    }
    
    @When("Calculate the insurance")
    public void calculate_the_insurance() {
        Customer customer = new Customer(age, sex, isMarried, licenseNumber);
        actualAnswer = CarInsurance.calCarIns(customer);
    }
    
    @Then("The insurance will cost {string}")
    public void the_insurance_will_cost(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer.toString());
    }
}