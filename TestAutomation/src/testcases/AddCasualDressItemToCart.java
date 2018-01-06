package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.CartSummary;
import pom.GenericElements;
import pom.HomePage;
import pom.WomensCasualsLanding;

public class AddCasualDressItemToCart extends BaseClass
{
	@Test
	public void addCasualDressItem () throws InterruptedException
	{
		// CREATE AN OBJECT OF HOMEPAGE TO CLICK CASUAL ITEMS
		WebElement element = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions actions = new Actions (driver);
		
		actions.moveToElement(element).build().perform();
		// 
		System.out.println("From Actions Done!!");
		
		HomePage homepage = new HomePage (driver);	
		Thread.sleep(3000);
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Dresses'])[2]")));
		homepage.clickLink("CasualDress");
		
		// CREATE AN OBJECT OF WOMENS CASUAL LANDING PAGE TO ADD ITEM TO THE CART
		WomensCasualsLanding womenscasual = new WomensCasualsLanding (driver);
		womenscasual.click("MediumCheckBox");
		womenscasual.click("Banner");
		
		driver.switchTo().frame(0);
		womenscasual.click("AddToCartButton");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		womenscasual.click("ProceedToCheckoutButton");
		
		// CREATE AN OBJECT OF GENERIC ELEMENTS PAGE TO CLICK GLOBAL WEB ELEMENTS
		GenericElements generic = new GenericElements(driver);
		generic.click("Logo");
		
		// FROM HOME PAGE MOUSE HOVER WOMENS TAB AND ADD WOMENS SUMMER SHIRTS TO THE CART
		WebElement womenstab = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions womens = new Actions (driver);
		actions.moveToElement(womenstab).build().perform();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Summer Dresses'])[1]")));
		homepage.clickLink("SummerDressTab");
		
		// USE THE ABOVE CODE
		womenscasual.click("Banner");
		driver.switchTo().frame(0);
		womenscasual.click("AddToCartButton");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		womenscasual.click("ProceedToCheckoutButton");
		generic.click("Logo");
		
		// FROM HOME PAGE MOUSE HOVER WOMENS TAB AND ADD T SHIRTS TO THE CART
		homepage.clickLink("TShirtsTab");
		
		// REUSE THE CODE
		womenscasual.click("Banner");
		driver.switchTo().frame(0);
		womenscasual.click("AddToCartButton");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		womenscasual.click("ProceedToCheckoutButton");
		
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	
	
