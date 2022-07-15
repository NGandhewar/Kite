package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart
{
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkcart;
    
	public YourCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void checkyourkcart()
	{
		checkcart.click();
	}
}
