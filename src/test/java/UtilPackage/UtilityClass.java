package UtilPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
   public void takesScreenshot(String str ,WebDriver driver) throws IOException
   { 
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File destination = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Screenshot\\"+str+".jpg ");
	 FileHandler.copy(src,destination);
   }
   
   public static String fetchData(int row,int cell)
   {
	   String str="";
	   return str;
   }
   
}
