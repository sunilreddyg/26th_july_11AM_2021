package findelements.Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		//Identify table
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		
		//Find list of Rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));

		//Target specific row
		WebElement SpecificRow=rows.get(4);
		
		//Find list of cells under selected row
		List<WebElement> cells=SpecificRow.findElements(By.tagName("td"));
		
		//get Cell Data
		String Cname=cells.get(0).getText();
		String MCap=cells.get(1).getText();
		String NetProfit=cells.get(6).getText();
		
		System.out.println(Cname+"   "+MCap+"    "+NetProfit);
	}

}
