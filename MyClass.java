package first;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class MyClass extends MyClass3
{
	public static void main(String...strings) throws InterruptedException, IOException
	{
		MyClass3 obj = new MyClass3();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://web.jns.ac.in/login.asp?corner=stud";
        String expectedTitle = "Jamnabai Narsee School";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if(actualTitle.contentEquals(expectedTitle))
        	System.out.println("Website accessed.");
        else
        	System.out.println("Website not accessed.");
        obj.readExcel(1);
        int i=0; final int time=0;
        for(; i<=MyClass3.rowCount; i++)
        {
        	obj.readExcel(i);
        	String userN=obj.userN;
        	String passW=obj.passW;
        	WebElement myelement1 = driver.findElement(By.id("username"));
        	myelement1.sendKeys(userN);
        	WebElement myelement2 = driver.findElement(By.id("password"));
        	myelement2.sendKeys(passW);
        	WebElement myelement3 = driver.findElement(By.xpath("//*[@id='table3']/tbody/tr[6]/td/input"));
        	myelement3.click();
        	Thread.sleep(time);
        	String URL=driver.getCurrentUrl();
        	if(URL.equals("http://web.jns.ac.in/index.asp"))
        	{
        		WebElement myelement4 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/p/a[2]"));
        		myelement4.click();
        		Thread.sleep(time);
        	}
        	System.out.println("Cycle complete.");
        }
        driver.close();
	}
}

