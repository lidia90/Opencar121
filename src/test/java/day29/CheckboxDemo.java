package day29;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckboxDemo {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specific one checkbox
		driver.findElement(By.xpath("//input[@id='monday' and @id='wednesday']")).click();
		
		//total number of checkboxes
		//List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//System.out.println("Total number of checkboxes:"+checkboxes.size()); //7


		//input[@id='wednesday']
		//input[@id='thursday']
	}

}
