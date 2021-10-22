package findelements.Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Checkbox_Inside_WebTable 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
	    Thread.sleep(3000);
	    
	    //identifying table
	    WebElement Table=driver.findElement(By.id("resultTable"));
	    
		
		//Find list of Rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
	    rows.remove(0);   //Skip Header
	    boolean flag=false;
	    //iterate for number or rows
	    for (int i = 0; i < rows.size(); i++) 
	    {
	    	//Target specific row
			WebElement DynamicRow=rows.get(i);
			//Get Row Text
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("Hitesh"))
			{
				flag=true;
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				cells.get(0).findElement(By.tagName("input")).click();
				break;
			}
			
		}
	    
	    if(flag==true)
	    {
	    	 //Click Delete Button
		    driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		    //Close alert message
		    driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
	    }
	    else
	    {
	    	System.out.println("Record not found at table");
	    }
	   
	    
	    


	}

}
