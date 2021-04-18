package step_Definition;


import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TC002_StepDef {
	LoginPage useMe = new LoginPage ();
	Actions act = new Actions(Driver.getDriver()) ;
	

	@When("User enters {string}  and {string} and click login")
	public void user_enters_and_and_click_login(String param1, String param2) {
		
		 useMe.enterUsername(param1);
		 useMe.enterPassword(param2);
		 act.moveToElement(useMe.submitButt).click().perform();
	}

	@Then("User should be able to verify invalid text")
	public void user_should_be_able_to_verify_invalid_text() {
	   String expectedTxt = useMe.invalidTxt.getText();
	   
	   Assert.assertEquals(expectedTxt, "Invalid credentials");
	}

	
	
}
