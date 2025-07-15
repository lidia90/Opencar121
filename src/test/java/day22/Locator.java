package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		boolean image=driver.findElement(By.className("login_logo")).isDisplayed();
		System.out.println(image);
		List<WebElement> button = driver.findElements(By.className("submit-button"));
		System.out.println(button.size());
		
	}

}
