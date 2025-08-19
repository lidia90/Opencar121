package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List <WebElement> ls = driver.findElements(By.xpath("//div[@class='post-body entry-content']/descendant::div[@class='form-group'][6]/select/option"));
	
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
				String s =ls.get(i).getText();
				System.out.println(s);
				
				if (!s.equals("Red"))
				{
					ls.get(i).click();
				}
			
		}
		
		
	}

}
