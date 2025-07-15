package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all d options & find size
		
		List<WebElement> totelm = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		System.out.println(totelm.size());
		
		//printing options from dd
		
		/*for(WebElement opsn : totelm)
		{
			System.out.println(opsn.getText());
		}*/
		
		//select multiple options
		
		for(int i=0;i<totelm.size();i++)
		{
			String a = totelm.get(i).getText();
			if (a.equalsIgnoreCase("python")||a.equalsIgnoreCase("mysql"))
			{
				totelm.get(i).click();
			}
		}
	}

}
