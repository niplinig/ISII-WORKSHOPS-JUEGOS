package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	private CarInsurance actualAnswer;
	char customerSex;
	
	@Given("Is {char}")
	public void the_customer_is_female(char sex) {
		customerSex = sex;
	}
	
	@When("Calculate the premium")
	public void calculate_the_premium() {
	actualAnswer = new CarInsurance(new Customer(20, customerSex, true, true), 0);
	}
	
	@Then("Substract {int} from the base insurance")
	public void substract_from_the_base_insurance(int expectedAnswer) {
	assertEquals(expectedAnswer, actualAnswer.getCost());
	}
}