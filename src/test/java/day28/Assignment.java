package day28;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Assignment {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> windowIDs = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		
		System.out.println(windowIDs.size());
		
		for (WebElement clicklink: windowIDs)
			
		{
			//System.out.println(clicklink.getText());
			clicklink.click();
		}
		
		Set <String> windwid = driver.getWindowHandles();
		
		for (String windw : windwid)
		{
			String title = driver.switchTo().window(windw).getTitle();
			System.out.println(title);
		}
		
		
	driver.quit();	
		
		
		
		
		
		
		
	}

}
