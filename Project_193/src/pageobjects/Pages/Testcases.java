package pageobjects.Pages;

import org.openqa.selenium.WebDriver;

public class Testcases 
{
	WebDriver driver;
	public Testcases(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	FB_Home home;
	FB_Reg reg;

	public void User_Registration()
	{
		home=new FB_Home(driver);
		home.clickSignup();
		
		reg=new FB_Reg(driver);
		reg.enter_Firstname("Darshan");
		reg.enter_lastname("Kiran");
	}
	
}
