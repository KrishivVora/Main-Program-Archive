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
import org.openqa.selenium.support.ui.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ChromeSetup
{
	String chromeDriverPath, chromeProfilePath, chromeProfileName, userN, passW, baseUrl, loginUrl, expectedTitle, expectedAlert, userN_xpath, passW_xpath, login_xpath, logout_xpath;
	int time;
	//username - mngr139905
    //password - edyverE
	ChromeSetup()
	{
		time = 500; //time in milliseconds to wait at every pause interval
		chromeDriverPath = "D:\\chromedriver.exe";
		chromeProfilePath = "C:\\Users\\Krishiv.vora\\AppData\\Local\\Google\\Chrome\\User Data\\";
		chromeProfileName = "Profile 1";
		userN = "mngr139905";
    	passW = "edyverE";
    	baseUrl = "http://www.demo.guru99.com/V4/";
    	loginUrl = "http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
    	expectedTitle = "Guru99 Bank Home Page";
    	expectedAlert = "User or Password is not valid";
    	userN_xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input";
    	passW_xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input";
    	login_xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]";
    	logout_xpath = "/html/body/div[3]/div/ul/li[15]/a";
	}
	public static void main(String...strings) throws InterruptedException, IOException
	{
		
	}
}