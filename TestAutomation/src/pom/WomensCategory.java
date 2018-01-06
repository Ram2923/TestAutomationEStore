package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensCategory 
{
	// DECLARE WEB ELEMENTS ON WOMENS CATEGORY PAGE
	@FindBy (xpath = "(//span[@class='grower CLOSE'])[1]") private WebElement TopsExpandIcon;
	@FindBy (xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[3]") private WebElement ExpandTshirts;
	
	// INITILIZE THE WEB ELEMENTS
	public WomensCategory(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// DEVELOP THE METHODS
	public void click (String click)
	{
		switch (click)
		{
		case "TopsExpand" :
		TopsExpandIcon.click();
		break;
		
		case "ExpandTShirts" :
		ExpandTshirts.click();
			
		}
		
	}
}
