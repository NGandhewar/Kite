package Filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filpkart_Canclebutton
{
	@FindBy(xpath= "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cross;
	
	public Filpkart_Canclebutton(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void canclebutton()
	{
		cross.click();
	}
    
}