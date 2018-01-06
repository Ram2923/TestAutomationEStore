package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalAndShippingInfo 
{
	// DECLARE WEB ELEMENTS ON PERSONAL AND SHIPPING INFO PAGE
	@FindBy (xpath = "//input[@id='id_gender1']") 	private WebElement GenderRadioButton;	
	@FindBy (xpath = "//input[@id='customer_firstname']") 	private WebElement FirstNameField;	
	@FindBy (xpath = "//input[@id='customer_lastname']") 	private WebElement LastNameFiled;	
	@FindBy (xpath = "//input[@id='passwd']") 	private WebElement PasswordField;	
	@FindBy (xpath = "//select[@id='days']") private WebElement DaysDropdown;	
	@FindBy (xpath = "//select[@id='months']") private WebElement MonthsDropdown;	
	@FindBy (xpath = "//select[@id='years']") private WebElement YearsDropdown;
	@FindBy (xpath = "//input[@id='firstname']") private WebElement AddressFirstNameField;
	@FindBy (xpath = "//input[@id='lastname']") private WebElement AddressLastNameField;
	@FindBy (xpath = "//input[@id='company']") private WebElement CompanyField;
	@FindBy (xpath = "//input[@id='address1']") private WebElement AddressField;
	@FindBy (xpath = "//input[@id='city']") private WebElement CityField;
	@FindBy (xpath = "//select[@id='id_state']") private WebElement StateDropdown;
	@FindBy (xpath = "//input[@id='postcode']") private WebElement PostCodeField;
	@FindBy (xpath = "//select[@id='id_country']") private WebElement CountryDropdown;
	@FindBy (xpath = "//input[@id='phone_mobile']") private WebElement MobileNumberField;
	@FindBy (xpath = "//input[@id='alias']") private WebElement AliasField;
	@FindBy (xpath = "(//i[@class='icon-chevron-right right'])[3]") private WebElement RegisterButton;
	
	
	// INITILIZE THE WEB ELEMENTS
	public PersonalAndShippingInfo (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// CREATE METHOD TO REGISTER THE USER
	public void registeruser (String firstname, String lastname, String passowrd, String addressfirstname, String addresslastname, String company,
			String address, String city, String postcode, String mobilenumber, String alias)
	{
		GenderRadioButton.click();
		FirstNameField.sendKeys(firstname);
		LastNameFiled.sendKeys(lastname);
		PasswordField.sendKeys(passowrd);
		
		Select days = new Select (DaysDropdown);
		days.selectByIndex(4);
		Select month = new Select (MonthsDropdown);
		month.selectByIndex(5);
		Select year = new Select (YearsDropdown);
		year.selectByIndex(10);
		
		AddressFirstNameField.sendKeys(addressfirstname);
		AddressLastNameField.sendKeys(addresslastname);
		CompanyField.sendKeys(company);
		AddressField.sendKeys(address);
		CityField.sendKeys(city);
		
		Select state = new Select (StateDropdown);
		state.selectByIndex(5);
		
		PostCodeField.sendKeys(postcode);
		
		Select country = new Select (CountryDropdown);
		country.selectByIndex(1);
		
		MobileNumberField.sendKeys(mobilenumber);
		AliasField.sendKeys(alias);
		RegisterButton.click();	
				
		
		
	}
	
	

}
