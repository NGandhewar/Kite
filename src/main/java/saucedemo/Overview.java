package saucedemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview
{
	public WebDriver driver;
	public File src,destination;
	@FindBy(xpath="//button[@id='finish']")
	private WebElement fbutton;
	
	public Overview(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void screenshot_webpage() throws IOException
	{
		src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		destination =new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Screenshot\\Saucedemo.jpg ");
		FileHandler.copy(src, destination);
	}
	
	public void clickon_finishbutton()
	{
		fbutton.click();
	}

}
