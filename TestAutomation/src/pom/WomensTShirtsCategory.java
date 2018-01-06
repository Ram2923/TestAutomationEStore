package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensTShirtsCategory 

{
	// DECLARE WEB ELEMENTS ON WOMENS T SHIRTS CATEGORY PAGE
	@FindBy (xpath = "//img[@title='Faded Short Sleeve T-shirts']") private WebElement WomensTShirtImage;
	
	// INITILIZE THE WEB ELEMENTS
	public WomensTShirtsCategory(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// DEVELOP THE METHODS
	public void clickItem ()
	{
		WomensTShirtImage.click();
	}
	
}
