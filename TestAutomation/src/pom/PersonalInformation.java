package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation 
{
	// DECLARE THE WEB ELEMENTS ON PERSONAL INFORMATION PAGE
	@FindBy (xpath = "//input[@id='firstname']") private WebElement FirstNameField;
	
	// INITILIZE THE WEB ELEMENTS
	public PersonalInformation (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// DEVELOP THE METHODS
	public void getValues ()
	{
		
	}

}
