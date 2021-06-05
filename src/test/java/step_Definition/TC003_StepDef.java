package step_Definition;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.LoginPage;
import utilities.Driver;

public class TC003_StepDef {
	
	LoginPage useMe = new LoginPage ();
	Actions act = new Actions(Driver.getDriver()) ;
	
	@When("User enters a blank username and  valid password {string} then verify  disallowed username  password to be empty")
	public void user_enters_a_blank_username_and_valid_password_then_verify_disallowed_username_password_to_be_empty(String password) {
		
		useMe.enterPassword(password);
		act.moveToElement(useMe.submitButt).click().perform();
		String emptyUserMsg = useMe.invalidTxt.getText();
		Assert.assertEquals(emptyUserMsg, "Username cannot be empty");
	}

	@When("User enters a valid username {string} and  blank password then verify  disallowed   password to be empty")
	public void user_enters_a_valid_username_and_blank_password_then_verify_disallowed_password_to_be_empty(String username) {
	    
		 useMe.usernameBox.clear();
		 useMe.passwordBox.clear();
		 useMe.enterUsername(username);
		 act.moveToElement(useMe.submitButt).click().perform();
		 String emptyPassMsg = useMe.invalidTxt.getText();
		 Assert.assertEquals(emptyPassMsg, "Password cannot be empty");
	}
	
	}
