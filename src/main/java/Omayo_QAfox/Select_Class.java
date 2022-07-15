package Omayo_QAfox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Select_Class 
{
   @FindBy(xpath="//select[@id='drop1']")
   private WebElement select;
   
   public Select_Class(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void selecttag()
   {
	   select.click();
	   Select s=new Select(select);
	   s.selectByVisibleText("doc 1");
	   List<WebElement> options=s.getOptions();
	   int size =options.size();
	   System.out.println("no.of options present in listbox= "+size);
	   System.out.println("options present in listy box:");
	   for(int i=0;i<size;i++)
	   {
		   System.out.println(options.get(i).getText());
	   }
	   
	   
	   
   }
}
