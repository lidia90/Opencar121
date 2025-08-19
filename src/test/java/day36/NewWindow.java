package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);	
		
		driver.get("https://www.opencart.com/");
		
		//Selenium4.x
		//driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		WebDriver nwwind = driver.switchTo().newWindow(WindowType.WINDOW);
		nwwind.get("https://www.opencart.com/");
		
		
	}

}
