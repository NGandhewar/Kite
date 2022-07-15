package Kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin 
{
	@FindBy(xpath="//input[@type='password']")
	private WebElement userpin;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement pinbtn;
	
	public KitePin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Pin(String pin)
	{
		userpin.sendKeys(pin);
	}
	public void Pin()
	{
		pinbtn.click();
	}

}
