package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[@value='Paris']")).click();
		driver.findElement(By.xpath("//option[@value='London']")).click(); 	
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int row = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		
		String prdata []= new String [row];
		
		
		
	}

}
