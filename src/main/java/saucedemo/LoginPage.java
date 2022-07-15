package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
    
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement button;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String id)
	{
		username.sendKeys(id);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void click_on_loginbutton()
	{
		button.click();
	}
	

}
