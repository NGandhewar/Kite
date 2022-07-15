package Test_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basePackage.BaseClass;
import saucedemo.CheckYourInformation;
import saucedemo.Homepage;
import saucedemo.LoginPage;
import saucedemo.LogoutPage;
import saucedemo.Overview;
import saucedemo.YourCart;

public class Test_BaseClass
{
	BaseClass class1;
	LoginPage login ;
	Homepage home;
	YourCart cart;
	CheckYourInformation checkinfo;
	Overview view;
	LogoutPage logout;
	WebDriver driver;
    @BeforeClass
    public void openLaunchBrowser() throws InterruptedException 
    {
    	class1 = new BaseClass();
    	//driver = class1.launchBrowser();
    	driver.get("https://www.saucedemo.com");
    }
    @BeforeMethod
    public void verifyLoginpage() throws InterruptedException
    {
    	login.enterusername("standard_user");
    	login.enterpassword("secret_sauce");
    	Thread.sleep(2000);
    	login.click_on_loginbutton();
    }
    
    @Test
    public void verifyHomepage() throws InterruptedException, IOException
    {
    	Thread.sleep(5000);
    	home.listbox();
    	home.Add_to_cart();
    	home.cart();
    	Thread.sleep(2000);
    	cart.checkyourkcart();
    	Thread.sleep(5000);
        checkinfo.enterfirstname("ABC");
        checkinfo.enterlastname("BCA");
        checkinfo.enterpostalcode("441");
        Thread.sleep(2000);
        checkinfo.continuebutton();
        view.screenshot_webpage();
        view.clickon_finishbutton();
        System.out.println(driver.getCurrentUrl());
    	System.out.println(driver.getTitle());
    }
    
    @AfterMethod
    public void Logout() throws InterruptedException
    {
    	logout.clickonmenubutton();
    	Thread.sleep(2000);
    	logout.clickonlogoutbutton();
    }
    @AfterClass
    public void afterclass() throws InterruptedException
    {
    	driver.close();
    }
}
