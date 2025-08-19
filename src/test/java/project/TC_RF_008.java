package project;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RF_008 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//new account details
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Dipp");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(generateNewEmail()+ "@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc@1234");
		String pwd = driver.findElement(By.xpath("//input[@id='input-password']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("abcgg@1234");
		String pwdd = driver.findElement(By.xpath("//input[@id='input-confirm']")).getAttribute("value");
		
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		if(!pwd.equals(pwdd))
		{
			String s = driver.findElement(By.xpath("//div[text()='Password confirmation does not match password!']")).getText();
			System.out.println(s);
			boolean s1=driver.findElement(By.xpath("//div[text()='Password confirmation does not match password!']")).isDisplayed();
			System.out.println(s1);
		}
		else
		{
			System.out.println("pwd matched");
		}
	}
	
	public static String generateNewEmail()
	{
		Date date = new Date ();		
		String s = date.toString();
		//System.out.println(date);
		String s1 = s.replaceAll("\\s+","").replaceAll(":", "");
		//System.out.println(s1);
		return s1;

	}

}
