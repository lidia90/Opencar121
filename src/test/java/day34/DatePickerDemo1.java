package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	 //past date
	
	static void pastdate(WebDriver driver, String yr,String mon,String day)
	
	{
		while(true)
		{
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(year.equals(yr) && month.equals(mon))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List <WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		
		for(WebElement dte : dt)
		{
			if(dte.getText().equals(day))
			{
				dte.click();
				break;

			}
		}
	}
	
	//future date
	
static void futuredate (WebDriver driver, String yr,String mon,String day)
	
	{
		while(true)
		{
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(year.equals(yr) && month.equals(mon))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List <WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		
		for(WebElement dte : dt)
		{
			if(dte.getText().equals(day))
			{
				dte.click();
				break;

			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String yr = "2026";
		String mon="August";
		String day = "10";
		
		//pastdate( driver,  yr, mon, day);
		futuredate( driver,  yr, mon, day);
		
		
		
				
	}

}
