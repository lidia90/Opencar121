package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		WebElement Rightclick = driver.findElement(By.xpath("//button[normalize-space()='Double Click Me']"));
		WebElement DoubleClick = driver.findElement(By.xpath("//button[normalize-space()='Double Click Me']"));
		
		click.click();
		
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		
		act.contextClick(Rightclick).build().perform();
		
		Thread.sleep(5000);
		act.doubleClick(DoubleClick).build().perform();
	}

}

//https://demoqa.com/buttons