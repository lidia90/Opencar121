package day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentStaticTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[@value='Paris']")).click();
		driver.findElement(By.xpath("//option[@value='London']")).click(); 	
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int row = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		
		String pricearr[] = new String [row];
		
		for(int r=1;r<=row;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			pricearr[r-1]=price; //adding price into array
		}
		
		for(String sortpr: pricearr)
		{
			System.out.println(sortpr);
		}
		
		Arrays.sort(pricearr);
		String lowestpr = pricearr[0];
		System.out.println("lowest price:"+lowestpr);
		
		for(int r=1;r<=row;r++)
		{
			String price =driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			
			if(price.equals(lowestpr))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John");
		driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
		driver.findElement(By.id("city")).sendKeys("Columbus");
		driver.findElement(By.id("state")).sendKeys("OH");
		driver.findElement(By.id("zipCode")).sendKeys("43240");
		driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2023");
		driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		String msg=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		
		if(msg.contains("Thank you for your purchase"))
		{
			System.out.println("Success !! Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}
	

}
