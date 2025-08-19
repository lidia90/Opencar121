package project;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RF_004 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String s = "First Name must be between 1 and 32 characters!";
		String usernm = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
		//System.out.println(usernm);
		
		if (usernm.equals(s))
		{
			System.out.println("msg is displayed for the blank username");
		}
	}

}
