package Kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin 
{
	//input[@id='userid']
	//input[@id='password']
	//button[@type='submit']
	
	// 1. Declaration :- Private
	  @FindBy(xpath="//input[@id='userid']")
	  private WebElement userid;
	  
	  @FindBy(xpath="//input[@id='password']")
	  private WebElement pass;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  private WebElement button;
	  
	// 2. Initialization :- Constructor 
	 public KiteLogin(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	 // 3. Usage :- Method (Actions)
	 public void enterid(String id)
	 {
		userid.sendKeys(id); 
	 }
	 public void enterpass(String Pwd)
	 {
		 pass.sendKeys(Pwd);
	 }
	 public void loginbutton()
	 {
		 button.click();
	 }  
}
