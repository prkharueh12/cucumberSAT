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

public class TC001_StepDef {
	LoginPage useMe = new LoginPage ();
	Actions act = new Actions(Driver.getDriver()) ;
	
	@Given("User is at the login page")
	public void user_is_at_the_login_page() {
	 String pageTitle = Driver.getDriver().getTitle();
	 System.out.println(pageTitle);
	}

	@When("User enters valid username and password and click login")
	public void user_enters_valid_username_and_password_and_click_login() {
		
		useMe.enterUsername(ConfigurationReader.getProperty("username"));
		
//		useMe.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
//		useMe.usernameBox.sendKeys("Admin");
		
		useMe.enterPassword(ConfigurationReader.getProperty("password"));
		
		act.moveToElement(useMe.submitButt).click().perform();
	}

	@Then("User should be able to verify welcome text")
	public void user_should_be_able_to_verify_welcome_text() {
		   String expectedTxt = useMe.dashBoardTxt.getText();
		   
		   Assert.assertEquals(expectedTxt, "Dashboard");
	}

	
	
}
