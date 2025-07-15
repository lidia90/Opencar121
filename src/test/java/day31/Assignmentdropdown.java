package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentdropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement optons = driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select opsn = new Select (optons);
		
		List <WebElement> op = opsn.getOptions();
		System.out.println(op.size());
		
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getText());
		}
		
		opsn.selectByValue("3");
	}

}
