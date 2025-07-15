package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		WebElement hotelbk = driver.findElement(By.xpath("//label[@class='opc-radio-list-label']//input[@id='product_551']"));
		hotelbk.click();
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Dipp");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/26/1990");
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Kolkata");
		
		//expected data - departure
		String year="2026";
		String month="Mar";
		String date="10";
				
		//open date picker
				
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		//year selection
		
		WebElement ddyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select ddyr = new Select(ddyear);
		ddyr.selectByVisibleText(year);
		
		//month selection
			
		WebElement currentmnth = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select cmnth = new Select(currentmnth);
		cmnth.selectByVisibleText(month);
		
		//date selection
		
		List <WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td"));
		
		for(WebElement alldt : dt)
		{
			if (alldt.getText().equals(date))
			{
				alldt.click();
				break;
			}
		}
			
			
		
	}

}
