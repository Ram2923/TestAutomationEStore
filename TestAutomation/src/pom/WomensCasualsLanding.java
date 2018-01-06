package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensCasualsLanding 
{
	// DECLARE WEB ELEMENTS ON WOMENS CASUAL DRESS LANDING PAGE
	@FindBy (xpath = "(//input[@type='checkbox'])[2]") private WebElement MediumSizeCheckbox;
	@FindBy (xpath = "(//input[@type='checkbox'])[1]") private WebElement SmallSizeCheckbox;
	@FindBy (xpath = "(//img[@class='replace-2x img-responsive'])[2]") private WebElement Banner;
	@FindBy (xpath = "//span[text()='Add to cart']") private WebElement AddToCartButton;
	@FindBy (xpath = "//a[@title='Proceed to checkout']") private WebElement ProceedToCheckoutButton;
	
	// INITILIZE WEB ELEMENTS
	public WomensCasualsLanding (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// DEVELOP METHODS
	public void click (String input)
	{
		switch (input)
		{
		case "MediumCheckBox":
		MediumSizeCheckbox.click();
		break;
		
		case "Banner" :
		Banner.click();
		break;
		
		case "AddToCartButton" :
		AddToCartButton.click();
		break;
		
		case "ProceedToCheckoutButton" :
		ProceedToCheckoutButton.click();
		break;
		
		case "SmallSizeCheckbox" :
		SmallSizeCheckbox.click();
		break;
			
		}
	}

}
