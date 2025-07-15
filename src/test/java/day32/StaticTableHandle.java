package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableHandle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//total no of rows in a table
		
		int aa=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(aa);
		
		//total no of cols
		
		int cc = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//System.out.println(cc.size());
		
		//read data from specific row and column
		//String booknm=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(booknm);
		
		//read data from all rows and colmns
		/*System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<=aa;r++)
		{
			for(int c=1;c<=cc;c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}*/
		
		//read bookname whose author is mukesh
		
		/*for(int r=2;r<=aa;r++)
		{
			for(int c=1;c<=cc;c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				//System.out.print(value+"\t");
			}*/
		
			//System.out.println();
			//find total price of all d books
			int total=0;
			for(int r=2;r<=aa;r++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				total = total+Integer.parseInt(value);
			}
			System.out.println(total);
	}

}
