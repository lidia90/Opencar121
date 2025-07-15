package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("mukesh otwani");
		//Thread.sleep(5000);
		List <WebElement> scrh = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(scrh.size());
		
	}

}
