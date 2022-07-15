package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement mbutton;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonmenubutton()
	{
		mbutton.click();
	}
	public void clickonlogoutbutton()
	{
		logoutbutton.click();
	}
	

}
