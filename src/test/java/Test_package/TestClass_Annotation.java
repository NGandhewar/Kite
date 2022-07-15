package Test_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_Annotation
{
	//priority
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("before suite");
  }
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("before test");
  }
  @BeforeClass
  public void beforeclass() 
  {
	  System.out.println("before class");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("before method");
  }
  @Test(groups="Abc")
  public void a01()
  {
	  System.out.println("C01");
  }
  @Test(groups="Abc")
  public void b02()
  {
	  System.out.println("C02");
  }
  @Test
  public void c03()
  {
	  System.out.println("C03");
  }
  @Test()
  public void d04()
  {
	  System.out.println("C04");
  }
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("after method");
  }
  @AfterClass
  public void afterclass()
  {
	  System.out.println("after class"); 
  }
  @AfterTest
  public void aftertest()
  {
	  System.out.println("after test");
  }
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("after suite");
  }
}

//@BeforeSuite  1
//@BeforeTest   2 
//@BeforeClass  3  
//@BeforeMethod 4 
//@Test         5
//@AfterMethod  6 
//@AfterClass   7 
//@AfterTest    8 
//@AfterSuite   9






