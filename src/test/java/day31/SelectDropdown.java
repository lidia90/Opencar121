package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcntryEl = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcntry = new Select(drpcntryEl);
		//select option from dd
		
		//drpcntry.selectByVisibleText("France");
		//drpcntry.selectByValue("canada");
		//drpcntry.selectByIndex(2);
		
		//capture total no of options in the dd
		
		List <WebElement>options = drpcntry.getOptions();
		System.out.println(options.size());
		System.out.println("No of options from a dropdown:");
		//printing options
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
	}

}
