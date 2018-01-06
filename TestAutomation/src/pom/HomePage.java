package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// DECLARE WEB ELEMENTS ON HOME PAGE
	@FindBy (xpath = "//a[@title='Log in to your customer account']") 	private WebElement SignInLink;	
	@FindBy (xpath = "//a[@title='Women']") 	private WebElement WomensTab;	
	@FindBy (xpath = "(//a[text()='Casual Dresses'])[2]") 	private WebElement CasualDressTab;
	@FindBy (xpath = "(//a[text()='Summer Dresses'])[1]") private WebElement SummerDressTab;
	@FindBy (xpath = "(//a[@title='T-shirts'])[2]") private WebElement TShirtsTab;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLink (String Link)
	{
		
		switch (Link)
		{
		case "Signin" :
		SignInLink.click();
		break;
		
		case "WomensTab" :
		WomensTab.click();
		break;
		
		case "CasualDress" :
		CasualDressTab.click();
		break;
		
		case "SummerDressTab" :
		SummerDressTab.click();
		break;
		
		case "TShirtsTab" :
		TShirtsTab.click();
		break;
		
			
		}
		
		
	}

}
