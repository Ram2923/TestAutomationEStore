package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.EmailAddress;
import generic.ReadFromExcel;
import pom.CreateAccount;
import pom.HomePage;
import pom.PersonalAndShippingInfo;

public class CreateAProfile extends BaseClass
{
	@Test
	public void createProfile () throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		// CREATE AN OBJECT OF HOMEPAGE TO CLICK SIGN-IN LINK
		HomePage homepage = new HomePage (driver);
		homepage.clickLink("Signin");	
		if (driver.findElement(By.xpath("//h3[text()='Create an account']")).isDisplayed())
		{
			System.out.println("Test Pass");
		}
		
		// CREATE AN OBJECT OF CREATE ACCOUNT PAGE TO ENTER EMAIL ADDRESS
		
		String email = EmailAddress.getEmailAddres();
		CreateAccount createaccount = new CreateAccount (driver);
		createaccount.enterEmailAddressAndClickCreateAccount(email);		
		if (driver.findElement(By.xpath("//h3[text()='Your personal information']")).isDisplayed())
		{
			System.out.println("Navigated to Create Account page");
		}
		
		Thread.sleep(3000);
		// CREATE AN OBJECT OF PERSONAL AND SHIP INFO PAGE TO ENTER USER DETAILS
		
		String path = "./ExcelSheet/TestDataAutomation.xlsx";
		String sheet = "Register";
		String Fname = ReadFromExcel.readData(path, sheet, 1, 0);
		String Lname = ReadFromExcel.readData(path, sheet, 1, 1);
		String pwd = ReadFromExcel.readData(path, sheet, 1, 2);
		String addFname = ReadFromExcel.readData(path, sheet, 1, 3);
		String addLname = ReadFromExcel.readData(path, sheet, 1, 4);
		String company = ReadFromExcel.readData(path, sheet, 1, 5);
		String address = ReadFromExcel.readData(path, sheet, 1, 6);
		String city = ReadFromExcel.readData(path, sheet, 1, 7);
		String pcode = ReadFromExcel.readData(path, sheet, 1, 8);
		String mobile = ReadFromExcel.readData(path, sheet, 1, 9);		
		
		PersonalAndShippingInfo personalandshipping = new PersonalAndShippingInfo (driver);
		personalandshipping.registeruser(Fname, Lname, pwd, addFname, addLname, company, address, city, "12234", "9538429675", "Mr");
		
		if (driver.findElement(By.xpath("//h1[text()='My account']")).isDisplayed())
		{
			System.out.println("User Registration Successfull!!");
		}

		
		
		
		
		
				
				
	}

}
