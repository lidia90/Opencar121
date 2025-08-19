package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String yr = "2024";
		String mon = "May";
		String dt = "20";
		
		while(true)
		{
			String cyr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String cmon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if (cyr.equals(yr) && cmon.equals(mon))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		
		List <WebElement> alldt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		for(WebElement cdt : alldt)
		{
			if (cdt.getText().equals(dt))
			{
				cdt.click();
				break;
			}
		}
		
	}

}
