package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {
/*Test case:
 1.launch browser chrome
 2.open URL https://demo.opencart.com
 3.Validate title should be "your store"
 4.close browser */
	
	
	public static void main(String[] args) {
		// 1.launch browser chrome
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		// 2.open URL https://demo.opencart.com
		driver.get("https://opencart.com/");
		//3.Validate title should be "your store"
		String actual_name=driver.getTitle();
		
		if(actual_name.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		//4.close browser --driver.close() or driver.quit();
		driver.quit();
		
	}

}
