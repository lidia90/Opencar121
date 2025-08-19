package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//frame 3
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium");
		
		//switch to inner frame
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[contains(@for,'i6')]//div[contains(@class,'YEVVod')]")).click();  //("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
		List <WebElement> frames = driver.findElements(By.xpath("//div[@class='uHMk6b fsHoPb']"));
		
		for (int i=1;i<frames.size();i++)
		{
			frames.get(i).click();
		}
		
		driver.switchTo().defaultContent();

		//form5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("cypress");
		
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
	}

}
