package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement male_id = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_id = driver.findElement(By.xpath("//input[@id='female']"));
		
		male_id.click();
		System.out.println("flag:"+" "+ male_id.isSelected());
		System.out.println("flag:"+" "+ female_id.isSelected());
		
		WebElement cntry = driver.findElement(By.xpath("//select[@id='country']"));
		System.out.println(cntry.isEnabled());

		
		
	}

}
