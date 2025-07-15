package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectbox {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ops= driver.findElement(By.xpath("//select[@id='colors']"));
		Select opsn = new Select (ops);
		
		List <WebElement> opt = opsn.getOptions();
		
		System.out.println(opt.size());
		
		for(WebElement op1 : opt)
		{
			String s = op1.getText();
			if(s.equalsIgnoreCase("red")||s.equalsIgnoreCase("green")||s.equalsIgnoreCase("white"))
			{
				op1.click();
			}
		}
	}

}
