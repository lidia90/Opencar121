package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//normal alert with OK button
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//Alert myalert = driver.switchTo().alert();
		//myalert.accept();
		
		//confirmation alert
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//send text to alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		//driver.switchTo().alert().sendKeys("java");
		String myalrt= driver.switchTo().alert().getText();
		System.out.println(myalrt);
		driver.switchTo().alert().sendKeys("java");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String txt = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(txt);
		
		
	}

}
