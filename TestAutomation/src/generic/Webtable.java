package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Desktop/Webtable.html");
				
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i=0; i<=rows.size()-1; i++)
		{
			String text = rows.get(i).getText();
			
			if (text.contains("Ram") || text.contains("testq"))
			{
				cb.get(i).click();
			}
		}

	}

}
