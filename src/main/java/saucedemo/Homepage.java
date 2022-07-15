package saucedemo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage
{   
	public WebDriver driver;
	public Select slc;
  public JavascriptExecutor js;
  @FindBy(xpath="//select[@class='product_sort_container']")
  private WebElement select;
  @FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[4]")
  private WebElement target;
  @FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[5]")
  private WebElement addtocart;
  @FindBy(xpath="//a[@class='shopping_cart_link']")
  private WebElement yourcart;
  
  public Homepage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  public void listbox()
  {
	  select.click();
	  slc = new Select(select);
	  slc.selectByVisibleText("Price (low to high)");
	  List<WebElement> options=slc.getOptions();
	  int size =options.size();
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(options.get(i).getText()); 
	  }
	  
  }
  public void ScrollDownthe_Webpage()
  {
	  js =(JavascriptExecutor) driver;
	  js.executeScript("aurguments[0].scrollIntoView(true);", target);  
  }
  public void Add_to_cart()
  {
	  addtocart.click();
  }
  public void cart()
  {
	  yourcart.click();
  }
  
}
