package day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();

		//driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("apple");
		//driver.findElement(By.xpath("//input[@id='small-searchterms'and @name='q']")).sendKeys("apple");
		//driver.findElement(By.xpath("//input[@id='small-searchterms'or @nam='q']")).sendKeys("apple");
		
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();//data-test="add-to-cart"
		boolean image = driver.findElement(By.xpath("//img[contains(@data-test,'item-sauce-labs')]")).isDisplayed();
		System.out.println(image);


	}

}
