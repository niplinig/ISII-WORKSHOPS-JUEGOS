package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {

	private CarInsurance actualAnswer;
	char customerSex;
	
	@Given("Is a female person")
	public void the_customer_is_female() {
		customerSex = 'F';
	}
	
	@When("Calculate the insurance")
	public void calculate_the_insurance() {
		Customer customer = new Customer(20, customerSex, true, true);
		actualAnswer = CarInsurance.calCarIns(customer);
	}
	
	@Then("The insurance will cost {string}")
	public void the_insurance_will_cost(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer.toString());
	}
}

