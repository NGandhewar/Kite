package Test_package;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Omayo_QAfox.AlertPopup;
import Omayo_QAfox.ChildPopup;
import Omayo_QAfox.Scrolldown;
import Omayo_QAfox.Select_Class;

public class QAfox 
{
   public static <Scrollby> void main(String[] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   driver.get("http://omayo.blogspot.com/search?q=hah");
	   
	   //Scrolldown webpage
	   Scrolldown down=new Scrolldown(driver);
	   down.scroll();
       
	   //Select option class
		Select_Class option=new Select_Class(driver);
		option.selecttag();
		Thread.sleep(2000);
		
	   //Alert popup class
	   AlertPopup popup=new AlertPopup(driver);
	   popup.altpop();
	   popup.promptpopup();
	  
	   //Child popup class
       ChildPopup popup1=new ChildPopup(driver);
       popup1.childpop();
       String main=driver.getWindowHandle();
		System.out.println(main);
		ArrayList<String> all=new ArrayList<String> (driver.getWindowHandles());
		String a=all.get(1);
		driver.switchTo().window(a);
		System.out.println(driver.getTitle());
		driver.close();
	    Thread.sleep(5000);

	   
	   
	   
	   
	   
	   
   }


}

