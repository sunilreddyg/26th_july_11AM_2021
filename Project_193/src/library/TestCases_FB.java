package library;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageobjects.Pages.FB_Home;
import pageobjects.Pages.FB_Reg;

public class TestCases_FB extends POM_CommonReusableActions
{
	
	WebDriver driver=null;
	FB_Home fb;
	FB_Reg reg;
	String url="http://facebook.com";
	FB_Home home=new FB_Home(driver);

	
	public void setupbrowser()
	{
		LaunchBrowser("chrome");
		driver=getdriver();
		setwindow_size(1025, 800);
		load_webpage(url);
		set_explicitwait_time(30);
		
	}
	
	
	public void User_Registration(String fname,String lastname,String email,String retypeemail,String password)
	{
		fb=new FB_Home(driver);
		fb.clickSignup();
		Assert.assertTrue(verify_titlePresented("Sign up for Facebook | Facebook"));
	
		reg=new FB_Reg(driver);
		reg.enter_Firstname(fname);
		reg.enter_lastname(lastname);
		Type_text(reg.Email_or_Mobile, email);
		Type_text(reg.RetypeEmail, retypeemail);
		Type_text(reg.Password, password);
		select_dropdown(reg.DOB_Day, "text", "12");
		select_dropdown(reg.DOB_month, "text", "Dec");
		select_dropdown(reg.DOB_year, "text", "2010");
		click_element(reg.Gender_Female);

	}
	
	

}
