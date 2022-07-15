package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckYourInformation 
{
   @FindBy(xpath="//input[@id='first-name']")
   private WebElement firstname;
   @FindBy(xpath="//input[@id='last-name']")
   private WebElement lastname;
   @FindBy(xpath="//input[@id='postal-code']")
   private WebElement postalcode;
   @FindBy(xpath="//input[@id='continue']")
   private WebElement cbutton;
   public CheckYourInformation(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterfirstname(String fname) 
   {
	   firstname.sendKeys(fname);
   }
   public void enterlastname(String lname)
   {
	   lastname.sendKeys(lname);
   }
   public void enterpostalcode(String code)
   {
	   postalcode.sendKeys(code);
   }
   public void continuebutton()
   {
	   cbutton.click();
   }
   
   
   
}


