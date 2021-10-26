package pageobjects.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Reg {


	WebDriver driver;
	public FB_Reg(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='/r.php']")
	public WebElement  signUp;

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement  FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement  LastName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement  Email_or_Mobile;

	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement  RetypeEmail;

	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement  Password;

	@FindBy(xpath = "//select[@name='birthday_day']")
	public WebElement  DOB_Day;

	@FindBy(xpath = "//select[@name='birthday_month']")
	public WebElement  DOB_month;

	@FindBy(xpath = "//select[contains(@name,'year')]")
	public WebElement  DOB_year;

	@FindBy(xpath = "//input[@value='1']")
	public WebElement  Gender_Female;

	@FindBy(xpath = "//input[@value='2']")
	public WebElement  Gender_Email;
	
	
	public void enter_Firstname(String Fname)
	{
		FirstName.clear();
		FirstName.sendKeys(Fname);
	}

	public void enter_lastname(String input)
	{
		LastName.clear();
		LastName.sendKeys(input);
	}

}
