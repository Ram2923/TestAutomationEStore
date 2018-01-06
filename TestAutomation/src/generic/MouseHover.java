package generic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover 
{
	@Test
	public void run () throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ADMIN/Desktop/Webtable.html");
	Thread.sleep(4000);
	
	/*WebElement element = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
	Actions actions = new Actions (driver);
	actions.moveToElement(element).perform();*/
	
	/*WebElement printeddress = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	Actions action = new Actions (driver);
	action.moveToElement(printeddress).build().perform();*/
	
	List<WebElement> rows = driver.findElements(By.xpath("//tr"));
	System.out.println(rows.size());
	
	List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	
	mainloop:
	for (int i=0; i<=rows.size()-1; i++)
	{
		 String text = rows.get(i).getText();
		 System.out.println(text); 
			 
		 // for (int j=0; j<=cb.size()-1; j++ )
		 {
			 if (text.contains("Ram"))
			 {
				 cb.get(i).click();
			 }
					 
		 }
			 
		}
		
	}
	
	
	
	
	

	
	
	
	}


