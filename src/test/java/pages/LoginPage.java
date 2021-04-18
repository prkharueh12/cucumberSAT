package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	@FindBy (id = "txtUsername")
	public WebElement usernameBox;
	
	@FindBy (id = "txtPassword")
	public WebElement passwordBox;
	
	@FindBy (id = "btnLogin")
	public WebElement submitButt;
	
	@FindBy (xpath = "//h1[contains(text(),'Dashboard')]")
	public WebElement dashBoardTxt;
	
	@FindBy (xpath = "//span[@id='spanMessage']")
	public WebElement invalidTxt;
	
	public LoginPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	public void enterUsername (String admin) {
		usernameBox.sendKeys(admin);
	}
	
	public void enterPassword (String param) {
		passwordBox.sendKeys(param);
	}
	
	
}// end class

