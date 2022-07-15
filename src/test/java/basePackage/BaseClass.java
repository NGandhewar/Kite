package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass
{ 
	public  WebDriver driver;
	public WebDriver launchBrowser(String browser)
	
	{
		if(browser.equalsIgnoreCase("ChromeBrowser"))
		{
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--disable-notifications");
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			FirefoxOptions opt = new FirefoxOptions();
			opt.addArguments("--disable-notifications");
			System.setProperty("WebDriver.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver(opt);
		} 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  return driver;
	}
}
