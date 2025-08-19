package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Prac {
	//private WebDriver driver;

  
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/");
		driver.manage().window().maximize();
		
		

        // Locate the date picker element
        WebElement datePicker =driver.findElement(By.xpath("//input[@name='bdaytime']"));

        // Using sendKeys() and TAB to switch between date & time fields
        datePicker.sendKeys("02262025"); 

        //datePicker.sendKeys("05012025"); // You can also use this

        datePicker.sendKeys(Keys.TAB);
        datePicker.sendKeys("12:30");

     //datePicker.sendKeys("1230"); // You can also use this

        // Submit the form
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Validate the entered date and time
       // WebElement validDateAndTime = driver.findElement(By.xpath("//div[contains(text(),'Birth Date')]"));

       
		
	}
}


