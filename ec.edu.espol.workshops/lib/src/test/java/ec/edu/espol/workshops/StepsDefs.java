package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
    private CarInsurance actualAnswer;
    char customerSex;
    @Given("Is {string}")
    public void the_customer_is_female(String sex) {
        customerSex = sex.charAt(0);
    }
    @When("Calculate the premiun")
    public void calculate_the_premium() {
    actualAnswer = new CarInsurance(new Customer(20, customerSex, true, true), 0);
    }
    @Then("Substract {string} from the base insurance")
    public void substract_from_the_base_insurance(String expectedAnswer) {
    assertEquals(expectedAnswer, actualAnswer.toString());
    }
}