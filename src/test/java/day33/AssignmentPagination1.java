package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPagination1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		for(int r=1;r<=4;r++)
		{
			if(r>1)
			{
				WebElement activepg = driver.findElement(By.xpath("//a[normalize-space()="+r+"]"));
				activepg.click();
			}
			int noofrows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			
			for(int i=1;i<=noofrows;i++)
			{
				String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[1]")).getText();
				String name= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[3]")).getText();
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td/input[@type=\"checkbox\"]")).click();
				
				System.out.println(id+"\t"+name+"\t"+price+"\t");
			}
			
		}
		
	}

}
