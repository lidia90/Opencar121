package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("a.ico-register")).click();
		//placeholder="Search store"
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
		driver.findElement(By.cssSelector(".inventory_item_name")).click();
		driver.findElement(By.cssSelector("[data-test='add-to-cart']")).click();
		//driver.findElement(By.cssSelector(".inventory_item_name[data-test='inventory-item-desc']")).click();
	}

}
