package day39;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.io.File;

public class TakingSS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//fullpage
		
		/* TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		sourcefile.renameTo(targetfile);*/
		
		//capture of specific section
		
		WebElement featuredProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile = featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile = new File (System.getProperty("user.dir") + "\\screenshot\\featuredProduct.png");
		sourcefile.renameTo(targetfile);
		
		
		
	}

}
