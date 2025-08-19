package day40;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.booking.com/index.de.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']//*[name()='svg']")).click();
	}

}
