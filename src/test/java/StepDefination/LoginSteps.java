package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	@Given("user on the Login Page")
	public void user_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Userloggedin");
	   
	}
	@And("user enters {string} with {string}")
	public void user_enters_with(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("userenteredstrings");
	    
	}
	@And("user click {string} button")
	public void user_click_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("usereclickbutton");
	   
	}
	@Then("user should see {string}")
	public void user_should_see(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("userenteredstrings");
	    
	}



}
