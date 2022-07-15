package Test_on_Kite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Kite.KiteHomepage;
import Kite.KiteLogin;
import Kite.KitePin;
import UtilPackage.UtilityClass;
import basePackage.BaseClass_Kite;

public class Test_Kite extends BaseClass_Kite
{
	WebDriver driver;
	BaseClass_Kite lbws;
	KiteLogin login;
	KitePin pin;
	KiteHomepage home;
	UtilityClass utility;
	@BeforeClass
	public void launchBrowsers() throws IOException
	{
		lbws=new BaseClass_Kite();
		driver = lbws.launchBrowser();
		login = new KiteLogin(driver);
		pin = new KitePin(driver);
		home =new KiteHomepage(driver);
		
	}	
	@BeforeMethod
	public void geturl()
	{
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
	}
	@Test
	public void loginPage() throws InterruptedException
	{
		login.enterid("MP1268");
		login.enterpass("Lokesh@1997");
		login.loginbutton();
	    Thread.sleep(5000);
		pin.Pin("959519");
		pin.Pin();
		Thread.sleep(5000);
		home.searchFund("ONGC");
		home.toBuy(driver);
		home.clickOnUseridButton();
		home.clickOnLogoutButton();
	}
	
	@AfterMethod
	public void captureScreenshot(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE);
		utility.takesScreenshot("kitefalitest", driver);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}


