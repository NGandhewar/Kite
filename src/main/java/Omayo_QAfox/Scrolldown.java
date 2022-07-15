package Omayo_QAfox;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scrolldown
{
	public JavascriptExecutor js;
	public WebDriver driver;
	@FindBy(xpath="//button[text()='Dropdown']")
	private WebElement target;
	
	public Scrolldown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void scroll()
	{
		 js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", target);
	}
	

}
