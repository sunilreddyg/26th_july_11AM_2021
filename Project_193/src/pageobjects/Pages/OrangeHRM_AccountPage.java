package pageobjects.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class OrangeHRM_AccountPage
{

	@FindBy(xpath = "//b[contains(.,'Admin')]")
	public WebElement  admin;
	
	@FindBy(xpath = "//b[contains(.,'PIM')]")
	public WebElement  pIM;
	
	@FindBy(xpath = "//b[contains(.,'Leave')]")
	public WebElement  leave;
	
	@FindBy(xpath = "//b[contains(.,'Time')]")
	public WebElement  time;
	
	@FindBy(xpath = "//b[contains(.,'Recruitment')]")
	public WebElement  recruitment;
	
	@FindBy(xpath = "//b[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//b[contains(.,'Performance')]")
	public WebElement  performance;
	
	@FindBy(xpath = "//b[contains(.,'Dashboard')]")
	public WebElement  dashboard;
	
	@FindBy(xpath = "//b[contains(.,'Directory')]")
	public WebElement  directory;
	
	@FindBy(xpath = "//b[contains(.,'Maintenance')]")
	public WebElement  maintenance;
	
	@FindBy(xpath = "//div[@id='mainMenuRightArrow']")
	public WebElement  Next_Arrow_Button;
	
	@FindBy(xpath = "//b[contains(.,'Buzz')]")
	public WebElement  buzz;



}