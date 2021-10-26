package pageobjects.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrangeHRM_Login 
{
	
	@FindBy(how=How.ID,using="txtUsername") 
	public WebElement Username;
	
	@FindBy(name="txtPassword")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	public WebElement Submit_login;
	
	@FindBy(xpath = "//a[contains(.,'Forgot your password?')]")
	public WebElement ForgotPassword;
	
	
	
	//UserLogin reusable method
	public void user_login(String UID,String PWD)
	{
		Username.clear();
		Username.sendKeys(UID);
		
		Password.clear();
		Password.sendKeys(PWD);
		
		Submit_login.click();
	}
	

}
