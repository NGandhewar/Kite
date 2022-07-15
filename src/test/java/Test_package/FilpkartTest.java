package Test_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Filpkart.FilpkartSearch;
import Filpkart.Filpkart_Canclebutton;
import Filpkart.Filpkart_Selectitem;

public class FilpkartTest 
{
    public static void main(String[] args) throws IOException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		Filpkart_Canclebutton cancel=new Filpkart_Canclebutton(driver);
		cancel.canclebutton();
		FilpkartSearch Src=new FilpkartSearch(driver);
		Src.Search_Item("study table");
		Src.Search_button();
		Filpkart_Selectitem item=new Filpkart_Selectitem(driver);
		item.select_item();
		/*Filpkart_Addcart addcart=new Filpkart_Addcart(driver);
		addcart.Pin("442401");
		addcart.Check();
		String main=driver.getWindowHandle();
		System.out.println(main);
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(0));
		addcart.Add_to_cart();*/
		File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   File dest =new  File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Screenshot\\filpkar.jpg ");
		   FileHandler.copy(scr, dest);
    }
}
