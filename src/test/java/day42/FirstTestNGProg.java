package day42;

import org.testng.annotations.Test;

public class FirstTestNGProg {

		
		@Test (priority=2) 
		void login()
		
		{
			System.out.println("login...");
		}
		
		@Test (priority=1)
		void open()
		
		{
			System.out.println("Open application...");
		}
		
		@Test(priority=3)
		void logout()
		
		{
			System.out.println("logout...");
		}
	}


