package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
	@Test
	public void plan()
	{
		System.out.println("Good");
		System.out.println("Good1");
	
		
		
	}
	@Test(groups="Smoke")
	public void planninf()
	{
		System.out.println("test");
	}
	
	@BeforeTest
		public void prerequisite()
		{
			System.out.println("I will execute first");
		}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I will execute at the last of the test");
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I will execute before Method");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("I will execute after all the test");
		
	}
		
}
