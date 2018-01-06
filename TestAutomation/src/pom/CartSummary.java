package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummary 
{
	// DECLARE WEB ELEMENTS ON CART SUMMARY PAGE
	@FindBy (xpath = "//a[@title='Continue shopping']") private WebElement ContinueShoppingButton;
	
	// INITILIZE THE WEB ELEMENTS
	public CartSummary(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// DEVELOP METHODS
	public void click (String input)
	{
		switch (input)
		{
		case "ContinueShoppingButton" :
		ContinueShoppingButton.click();
		break;
		}
	}

}
