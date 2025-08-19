package day38;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		js.executeScript("arguments[0].setAttribute('value','John')",inputbox);
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()",radiobtn);

	}

}
