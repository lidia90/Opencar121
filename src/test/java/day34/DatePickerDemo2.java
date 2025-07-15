package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@class='newtabs horizontal']//ul[@class='resp-tabs-list '][1]/li[3]")).click();

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='newtabs horizontal']//ul[@class='resp-tabs-list '][1]//li[@id='Icon Trigger']")).click();

		
		driver.findElement(By.xpath("//img[@title='Select date']")).click();
	}

}
