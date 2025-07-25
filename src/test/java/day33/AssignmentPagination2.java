package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPagination2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("\\input[name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'viewAdminModule')]")).click();
		
		int rows= driver.findElements(By.xpath("//div[@class='oxd-table-body']/div")).size();
		
		System.out.println(rows);
		
		for(int r=1;r<=rows;r++)
		{
			String username=driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-card']["+r+"]//div//div[2]/div")).getText();
			
			System.out.println(username);
			
		}
		//String username = driver.findElement(By.xpath("//div[@role='table']//div[@class='header'][normalize-space()='Username']")).getText();
		//System.out.println(username);
	
	}

}
