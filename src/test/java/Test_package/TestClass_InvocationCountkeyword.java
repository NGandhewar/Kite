package Test_package;

	import org.testng.annotations.Test;

	public class TestClass_InvocationCountkeyword
	{
		//priority
	 
	  @Test(invocationCount=2,groups="Abc")
	  public void a01()
	  {
		  System.out.println("TC01");
	  }
	  @Test(timeOut = 2000,groups="Bca")
	  public void b02() throws InterruptedException
	  {
		  System.out.println("TC02");
	  }
	  @Test(invocationCount = 3,groups="Abc")
	  public void c03()
	  {
		  System.out.println("TC03");
	  }
	  @Test(dependsOnMethods="a01",groups="Bca")
	  public void d04()
	  {
		  System.out.println("TC04");
	  }
	  @Test
	  public void e05()
	  {
		  System.out.println("TC05");
	  }
	 
	}


