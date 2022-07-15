package Filpkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilpkartSearch 
{
	@FindBy(xpath="//input[@class='_3704LK']")//search 
     private WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu']")//search button
	private WebElement button;
	
	public FilpkartSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Search_Item(String src)
	{
		search.sendKeys(src);
	}
	public void Search_button()
	{
		button.click();
	}
}
