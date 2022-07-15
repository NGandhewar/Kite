package Filpkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Scroll_window 
{
	
	 public Scroll_window(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }

	public void Scroll(String scroll)
    {
	   // JavascriptExecutor driver=null;
		//JavascriptExecutor js=(JavascriptExecutor) driver;
	  //  js.executeScript(scroll);
    }
}