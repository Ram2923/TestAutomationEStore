package dbValidationCases;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.DBConnection;
import pom.MyAccount;
import testcases.CreateAProfile;

public class CreateProfileAndValidateDB extends CreateAProfile
{
	@Test
	public void dnValidation () throws ClassNotFoundException, SQLException
	{
		// CREATE AN OBJECT ON MY ACCOUNT PAGE TO CLICK ON MY PERSONAL INFORMATION LINK
		MyAccount myaccount = new MyAccount(driver);
		myaccount.clickSignoutLink("MyPersonalInformationLink");
		String namefield = driver.findElement(By.xpath("//input[@id='firstname']")).getAttribute("value");
		
		DBConnection dbconnection = new DBConnection();
		dbconnection.dbValidation(namefield);
		
		
		if (namefield.equalsIgnoreCase(dbconnection.firstname))
		{
			System.out.println("DB Validation Done !!");
			System.out.println("The First name is " + dbconnection.firstname);
		}
	}
}
