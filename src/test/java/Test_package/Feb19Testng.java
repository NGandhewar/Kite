package Test_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Feb19Testng 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Beforemethod");
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test001");
	}
	@Test
	public void test2()
	{
		System.out.println("Test002");
	}
	@Test
	public void test3()
	{
		System.out.println("Test003");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass");
	}
	

}
