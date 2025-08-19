package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RF_009 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//new account details
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Mootori");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("amotoori@gmail.com");
		String s = "Warning: E-Mail Address is already registered!";
		//System.out.println(s);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		if((driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()).equals(s))//Warning: E-Mail Address is already registered!
		{
			System.out.println("email is existed");
		}
	}

}
