package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPagination3 {
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/weekly/groupall");
		driver.manage().window().maximize();
		
	
		int gainers = driver.findElements(By.xpath("//h2[normalize-space()='Gainers']/following-sibling::div//div")).size();
		System.out.println("Gainer types :" + gainers);
		
	WebElement gainersByTime = driver.findElement(By.xpath("//h2[normalize-space()='Gainers']/following-sibling::div//div[3]"));
			//System.out.println("********* Based on "+gainersByTime.getText()+" ***********");

			gainersByTime.click();  // Daily/Weekly/Monthly

			
		
	}

}
