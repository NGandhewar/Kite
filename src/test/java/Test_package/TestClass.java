package Test_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		String path="C:\\Users\\LENOVO\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		//String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);
		
		Workbook w= WorkbookFactory.create(file);
		Sheet sh= w.getSheet("Sheet1");
		
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		double data2 =sh.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data2);
		
		boolean data3 = sh.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data3);
	}

}
