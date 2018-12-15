package first;
//package excelExportAndFileIO;

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
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class MyClass4 //extends ChromeSetup, MyClass5
{
	static WebDriver driver;
	void ChromeLaunch()
	{
		ChromeSetup chr = new ChromeSetup();
		System.setProperty("webdriver.chrome.driver", chr.chromeDriverPath);
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir="+chr.chromeProfilePath);
		options.addArguments("--profile-directory="+chr.chromeProfileName);
		driver = new ChromeDriver(options);*/
		driver = new ChromeDriver();
	}
	boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()
	public static void main(String...strings) throws NoAlertPresentException, InterruptedException, IOException
	{
		MyClass4 obj = new MyClass4();
		MyClass5 exc = new MyClass5();
		obj.ChromeLaunch();
		ChromeSetup chr = new ChromeSetup();
		String baseUrl = chr.baseUrl;
        String expectedTitle = chr.expectedTitle;
        String actualTitle = new String();
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if(actualTitle.contentEquals(expectedTitle))
        {
        	System.out.println("Website accessed.");
        }
        else
        {
        	System.out.println("Website not accessed.");
        }
        exc.readExcel(1);
        int i = 0;
        Alert alert;
        System.out.println("Number of entries: "+MyClass5.rowCount);
        for(; i<MyClass5.rowCount; i++)
        {
        	exc.readExcel(i);
        	String userN = exc.userN;
        	String passW = exc.passW;
        	WebElement myelement1 = driver.findElement(By.xpath(chr.userN_xpath));
        	myelement1.sendKeys(userN);
        	WebElement myelement2 = driver.findElement(By.xpath(chr.passW_xpath));
        	myelement2.sendKeys(passW);
        	WebElement myelement3 = driver.findElement(By.xpath(chr.login_xpath));
        	myelement3.click();
        	Thread.sleep(chr.time);
        	if(obj.isAlertPresent()==false) //|| ((driver.switchTo().alert().getText().contentEquals(chr.expectedAlert)==false)))
        	{
        		String URL = driver.getCurrentUrl();
        		WebElement myelement4 = driver.findElement(By.xpath(chr.logout_xpath));
        		myelement4.click();
        		System.out.println("Login successful. (URL: "+URL+")");
        		alert = driver.switchTo().alert();
        	}
        	else
        	{
        		System.out.println("Login unsuccessful.");
        		alert = driver.switchTo().alert();
        		String currentAlert = alert.getText();
        		if(currentAlert.contentEquals(chr.expectedAlert))
            	{
            		System.out.println("Error message displayed correctly.");
            	}
            	else
            	{
            		System.out.println("Error message not displayed correctly.");
            	}
        	}
    		Thread.sleep(chr.time);
        	alert.accept();
        	System.out.println("Alert dismissed.");
        	Thread.sleep(chr.time);
        	System.out.println("Cycle complete x"+(i+1));
        }
        System.out.println("Test complete.");
        driver.close();
	}
}