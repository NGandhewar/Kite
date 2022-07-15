package Filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filpkart_Selectitem 
{
	@FindBy(xpath="(//a[@class='s1Q9rs'])[4]")
	private WebElement select;
	
	public Filpkart_Selectitem(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void select_item()
	{
		select.click();
	}

}
