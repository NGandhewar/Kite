package Test_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilPackage.UtilityClass;
import basePackage.BaseClass_Kite;
import letskodiet.Practice_page;
import letskodiet.Practice_page2;

public class Practice_page_Testclass 
{
	WebDriver driver;
	BaseClass_Kite baseclass;
	Practice_page pages;
	Practice_page2 page2;
	UtilityClass util;
	
   @BeforeClass
   public void launchBrowserWebpage()
   {
	   baseclass=new BaseClass_Kite();
	   //driver =  baseclass.launchBrowser();
	   pages = new Practice_page(driver);
	   page2 = new Practice_page2(driver);
	   util = new UtilityClass();
   }

@BeforeMethod
   public void geturl()
   {
	  driver.get("https://courses.letskodeit.com/practice");
   }
   @Test
   public void checkAllWebElements() throws InterruptedException
   { 
	   pages.radioButtonExample();
	   pages.listBox();
	   pages.multiSelectBox();
	   pages.checkBox();   
   }
   @Test
   public void allWindows() throws InterruptedException
   {
	   Thread.sleep(2000);
	   page2.openNewWindow(driver);
	   page2.entername("namita", driver);
   }
   @AfterMethod
   public void captureScreenshots() throws IOException
   {
	 util.takesScreenshot("practicepage", driver);
	   
   }
   
   @AfterClass
   public void closeBrowser()
   {
	   driver.close();
   }
   
}
