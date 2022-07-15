package Kite;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage 
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath="//span[text()='TATAMOTORS']")
	private WebElement buybtn;
	@FindBy(xpath="//span[@class='user-id']")
    private WebElement user_id;	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logoutbutton;
	public KiteHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchFund(String sfund )
	{
		search.click();
		search.sendKeys(sfund);
		search.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	public void toBuy(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(buybtn).perform();
		act.click(buybtn);
		
	}
	public void clickOnUseridButton()
	{
	  user_id.click();	
	}
	public void clickOnLogoutButton()
	{
		logoutbutton.click();
	}
}
