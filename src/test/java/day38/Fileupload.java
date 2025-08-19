package day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\saika\\OneDrive\\Desktop\\Selenium\\button-chkbox\\test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("test1.txt"))
		{
			System.out.println("File is sucessfully uploaded");
		}
		else
		{
			System.out.println("Upload failed.");
		}
	}

}
