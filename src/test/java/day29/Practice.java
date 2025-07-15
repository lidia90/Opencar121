package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
		List <WebElement> wbelmnt = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(wbelmnt.size());
		
		for(int i=0;i<wbelmnt.size();i++)
		{
			if(i==1 || i==3 || i==5)
			{
				wbelmnt.get(i).click();
			}
		}
	}
	
}


