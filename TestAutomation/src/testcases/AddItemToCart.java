package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.AddToCart;
import pom.HomePage;
import pom.WomensCategory;
import pom.WomensTShirtsCategory;

public class AddItemToCart extends BaseClass
{

	@Test
	public void addItemToCart () throws InterruptedException
	{
		// CREATE AN OBJECT OF HOMEPAGE TO CLICK SIGN-IN LINK
		HomePage homepage = new HomePage (driver);
		homepage.clickLink("WomensTab");	
		
		// CREATE AN OBJECT OF WOMENS CATEGORY LANDING PAGE TO GO TO WOMENS TSHIRTS
		WomensCategory womenscategory = new WomensCategory (driver);
		womenscategory.click("TopsExpand");
		womenscategory.click("ExpandTShirts");
		
		// CREATE AN OBJECT OF WOMENS T-SHIRT CATEGORY PAGE TO ADD ITEM TO THE CART
		WomensTShirtsCategory womenstshirt = new WomensTShirtsCategory (driver);
		womenstshirt.clickItem();
		
		
		// CREATE AN OBJECT OF ADD TO CART PAGE TO ADD ITEM TO THE CART
		AddToCart addtocart = new AddToCart (driver);
		driver.switchTo().frame(0);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='add_to_cart']")));
		addtocart.clickButton("Addtocartbutton");
		
		driver.switchTo().defaultContent();	
		// new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		Thread.sleep(3000);
		// driver.switchTo().frame(0);
		addtocart.clickButton("Proceedtocheckout");
				
		
	}
}
