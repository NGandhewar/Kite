package letskodiet;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice_page2
{
	@FindBy(xpath="//button[@id='openwindow']")
	private WebElement openwindow;
	@FindBy(xpath="(//input[@id='name'])[1]")
	private WebElement name;
	@FindBy(xpath="(//input[@id='alertbtn'])[1]")
	private WebElement alertbtn;
	@FindBy(xpath="(//input[@id='confirmbtn'])[1]")
	private WebElement confirmbtn;
	
	public Practice_page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void openNewWindow(WebDriver driver) throws InterruptedException
	{
	    openwindow.click();
	    String mainwindow=driver.getWindowHandle();
	    System.out.println(mainwindow);
	    ArrayList<String> nxtwdw= new  ArrayList<String>(driver.getWindowHandles());
	    String a=nxtwdw.get(1);
		driver.switchTo().window(a);
		Thread.sleep(5000);
		driver.close();
	}
    public void entername(String name1, WebDriver driver) throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.switchTo().defaultContent();
    	name.click();
    	name.sendKeys(name1);
    }
}
