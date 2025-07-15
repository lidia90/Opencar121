package day33;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPagination4 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println(rows);
		
		for(int r=1;r<=rows;r++)
		{
			String name = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[1]")).getText();
			String ntwrk = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[2]")).getText();
			String memory = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[3]")).getText();
			String cpu = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[4]")).getText();
			String disk = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[5]")).getText();
			
			System.out.println(name+"\t"+"ntwrk"+"\t"+memory+"\t"+cpu+"\t"+disk);//
		}
	}

}
