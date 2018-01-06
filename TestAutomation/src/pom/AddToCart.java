package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart 
{
	WebDriver driver;
	// DECLARE WEB ELEMENTS ON ADD TO CART PAGE
	@FindBy (xpath = "//p[@id='add_to_cart']") private WebElement AddToCartButton;
	@FindBy (xpath = "//a[@title='Proceed to checkout']") private WebElement ProceedToCheckoutButton;
	@FindBy (xpath = "(//i[@class='icon-trash'])[last()]") private WebElement RemovelastItemIcon;
	
	// INITILIZE THE WEB ELEMENTS
		public AddToCart(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			
		}
		
	// DEVELOP THE METHODS
		public void clickButton (String click)
		{
			switch (click)
			{
			case "Addtocartbutton" :
			AddToCartButton.click();
			break;
			
			case "Proceedtocheckout" :				
			ProceedToCheckoutButton.click();
			break;
			
			case "RemovelastItemIcon" :
			RemovelastItemIcon.click();
			break;
			}
			
		}

}
