package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[position()>1]")).size();
		//System.out.println(row);
		
		String pricearr[] = new String [row];
		Thread.sleep(5000);
		List<WebElement> price=driver.findElements(By.xpath("//table[@class='BookTable']//tbody//tr[2]//td[4]"));
		
		for(WebElement x: price)
		{
			System.out.println(x.getText());
		}
		
		
	}

}
