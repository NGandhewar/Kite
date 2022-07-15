package Omayo_QAfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildPopup 
{
	WebDriver driver;
	@FindBy(xpath="//a[text()='Open a popup window']")
	private WebElement childpopup;
	
	public ChildPopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void childpop()
	{
		childpopup.click();
	}
}
