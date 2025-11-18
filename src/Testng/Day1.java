package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 
{
	@AfterTest
	public void LastEXECUTION()
	{
		System.out.println("My last execution");
	}
	@Test (groups="Smoke")
	public void Demo()
	{
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.println("Hello3");
		System.out.println("Hello4");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I will execute before all the test");
		System.out.println("I will execute before all the test1");
		System.out.println("I will execute before all the test2");
		System.out.println("I will execute before all the test3s");
	}
	@BeforeTest
	public void bfTest()
	{
		System.out.println("I will execute before test");
	}
	
	@AfterTest
	public void afTest()
	{
		System.out.println("I will execute all after test");
	}
	@Test(groups = "Smoke")
	public void testing()
	{
		System.out.println("smoke tetsing");
		
	}
	@Test(groups = "Sanity")
	public void testing2()
	{
		System.out.println("sanity tetsing");
		
	}

}
