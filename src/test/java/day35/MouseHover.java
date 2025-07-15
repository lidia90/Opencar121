package day35;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ecommerce-playground.lambdatest.io/");
		driver.manage().window().maximize();
		
		WebElement addon = driver.findElement(By.xpath("//div[@class='info']//span[normalize-space()='AddOns']"));
		WebElement design = driver.findElement(By.xpath("//span[normalize-space()='Widgets']"));
		
		Actions act = new Actions (driver);
		act.moveToElement(addon).moveToElement(design).click().perform();
	}

}
