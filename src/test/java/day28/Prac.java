package day28;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Prac {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		int num = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a")).size();
		System.out.println("number of link is:"+ num);	
		
		List <WebElement> mylist = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
		
		for(WebElement webid : mylist)
		{
			webid.click();
		}
		
		Set <String> myset = driver.getWindowHandles();
		
		for(String windid : myset)
		{
			String s = driver.switchTo().window(windid).getTitle();
			System.out.println(s);
		}
	}
}
