package letskodiet;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Practice_page 
{
	public WebDriver driver;
	@FindBy(xpath="(//input[@name='cars'])[2]")
	private WebElement radiobutton;
	
	@FindBy(xpath="//select[@name='cars']")
    private WebElement selectbutton ;
	
	@FindBy(xpath="//select[@name='multiple-select-example']")
	private WebElement multiplebutton;
	
	@FindBy(xpath="(//input[@type='checkbox'])")
	private List<WebElement> checkboxbutton;
	
	public Practice_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void radioButtonExample() 
	{
		radiobutton.click();
	}
	
	public void listBox()
	{
		Select slc=new Select(selectbutton);
		slc.selectByVisibleText("Benz");
		List<WebElement> options= slc.getOptions();
		for(int i=0;i<options.size();i++)
			System.out.println(options.get(i).getText());
	}
	
	public void multiSelectBox()
	{
		Select slc1 = new Select(multiplebutton);
		slc1.selectByVisibleText("Orange");
		List<WebElement>opt=slc1.getOptions();
		for(int i=0;i<opt.size();i++)
			System.out.println(opt.get(i).getText());
	}
	public void checkBox()
	{
		List<WebElement> boxes= checkboxbutton;
		int size=boxes.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			boxes.get(i).click();
		}
	}
	
	
	
}
