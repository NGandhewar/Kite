package basePackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass_Kite 
{
       WebDriver driver;
      
	public  WebDriver launchBrowser()
	{
	       ChromeOptions option=new ChromeOptions();
	       option.addArguments("--disable-notifications");
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;
	}

}
