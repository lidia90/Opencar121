package day32;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5);
		driver.findElement(By.xpath("//button/div[@class='Alle akzeptieren']")).click();
		//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
	}

}
