package day29;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentChkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practice.expandtesting.com/radio-buttons#google_vignette");
		driver.manage().window().maximize();
		
		//total number of checkboxes
		
		List <WebElement> chkbox = driver.findElements(By.xpath("(//div[@class='row-md-6 mx-3'])[1]//div//input[@type='radio']"));
		
		System.out.println(chkbox.size());
		
		//Select all the checkboxes
		
		//driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		//System.out.println(chk);
		
		WebElement colr = driver.findElement(By.xpath("//input[@id='red']"));
		colr.click();
		

	}

}
