package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{
	@FindBy (xpath = "//a[@title='Log me out']") private WebElement LogoutLink;
	
	public MyAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignoutLink ()
	{
		LogoutLink.click();
	}

}
