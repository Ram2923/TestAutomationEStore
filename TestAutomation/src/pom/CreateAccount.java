package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount 
{
	// DECLARE EMAIL FIELD WEBELEMENT	
	@FindBy (xpath = "//input[@id='email_create']")
	private WebElement EmailField;
	
	// DECLARE CREATE ACRROUNT BUTTON
	@FindBy (xpath = "//button[@id='SubmitCreate']")
	private WebElement CreateAccountButton;
	
	
	public CreateAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}	
	
	
	public void enterEmailAddressAndClickCreateAccount (String email)
	{		
		EmailField.sendKeys(email);
		CreateAccountButton.click();
				
	}

}
