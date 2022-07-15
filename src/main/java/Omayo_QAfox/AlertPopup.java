package Omayo_QAfox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPopup 
{
	public Alert alt;
	public Alert alt1;
	public WebDriver driver;
	@FindBy(xpath="//input[@id='alert1']")
	private WebElement Alertpopup;
	@FindBy(xpath="//input[@id='prompt']")
	private WebElement Promptpopup;
	
	public AlertPopup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void altpop() throws InterruptedException
	{
		Alertpopup.click();	
		  alt=driver.switchTo().alert();
		   Thread.sleep(2000);
		   alt.accept();
		   Thread.sleep(2000);
	}
    public void promptpopup() throws InterruptedException
    {
    	Promptpopup.click();
       alt1=driver.switchTo().alert();
  	   Thread.sleep(2000);
  	   alt1.sendKeys("namita");
  	   alt1.accept();
    }
	

}
