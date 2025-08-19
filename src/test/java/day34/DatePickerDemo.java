package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		
		//Method 1
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/26/1990");
		
		//Method 2
		String yr = "1990";
		String mnth = "01";
		String day = "26";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	}

}
