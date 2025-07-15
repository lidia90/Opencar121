package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

public class AnnotationDemo2 {


	@BeforeClass
	void login()
	{
		System.out.println("This is login..");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("this is logout...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search...");
	}
	
	
	@Test(priority=2)
	void advacedsearch()
	{
		System.out.println("this advanced search....");
	}
	

	

}
