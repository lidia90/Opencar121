package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		boolean image=driver.findElement(By.className("login_logo")).isDisplayed();
		System.out.println(image);
		driver.findElement(By.className("submit-button")).click();
		//System.out.println(button);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
	}

}
