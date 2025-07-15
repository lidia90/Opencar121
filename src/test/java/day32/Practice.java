package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//total no of rows in a table
		
		int aa= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//total no of cols
		
		int cc = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		for(int r=2;r<=aa;r++)
		{
		
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				System.out.println(value+"\t");
			
		}
		
		//read bookname whose author is mukesh
		
		/*for(int r=2;r<=aa;r++)
		{
			for(int c=1;c<=cc;c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				//System.out.print(value+"\t");
			}*/
		
			
	}

}
