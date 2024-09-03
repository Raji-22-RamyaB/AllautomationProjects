package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

	@Given("Thanons has the Infinity Stones")
	public void thanons_has_the_infinity_stones() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Thanose has the Infinity Stones");
	}
	@When("Thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos snaps his fingers");
	}
	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("half of the living things died");
	}

	
	
	
	
}
