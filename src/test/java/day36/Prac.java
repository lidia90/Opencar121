package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regl = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regl).keyUp(Keys.CONTROL).perform();
		
		
		
		List <String> ls = new ArrayList (driver.getWindowHandles());
		
		driver.switchTo().window(ls.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENEDY");
		
		driver.switchTo().window(ls.get(0)); // switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
		
		Set <String> st = driver.getWindowHandles();
		
		for (String x : st)
		{
			String elm = driver.switchTo().window(x).getTitle();
			System.out.println(elm);
		}
	}

}
