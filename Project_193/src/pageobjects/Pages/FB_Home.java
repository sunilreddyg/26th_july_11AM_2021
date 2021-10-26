package pageobjects.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Home {

	WebDriver driver;
	public FB_Home(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='/r.php']")
	public WebElement Signup_link;
	
	@FindBy(linkText="Messenger")
	public WebElement Messenger;
	
	
	public void clickSignup()
	{
		Signup_link.click();
	}

}
