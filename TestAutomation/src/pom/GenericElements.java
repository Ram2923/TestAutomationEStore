package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenericElements 
{
	// DECLARE GENERIC WEB ELEMENTS
	@FindBy (xpath = "//img[@class='logo img-responsive']") private WebElement Logo;
	
	// INITILIZE THE WEB ELEMENTS
	public GenericElements(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// DEVELOP METHODS
	public void click (String input)
	{
		switch (input)
		{
		case "Logo" :
		Logo.click();
		break;
		}
	}

}
