package Filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filpkart_Addcart
{
	@FindBy(xpath="//input[@class='_36yFo0']")
	private WebElement pincode;

	@FindBy(xpath="//span[@class='_2P_LDn']")
	private WebElement check;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement cart;
	
	public Filpkart_Addcart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Pin(String pin)
	{
		pincode.sendKeys(pin);
	}
	public void Check()
	{
		check.click();
	}
	
	public void Add_to_cart()
	{
		cart.click();
	}
}
