package first;
//package excelExportAndFileIO;import java.io.File;

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
public class MyClass3
{
	String filePath, fileName, sheetName, userN, passW, fp;
	static int rowCount;
	MyClass3()
	{
		filePath="D:\\";
		fileName="Book1.xlsx";
		sheetName="Sheet1";
		userN="";
		passW="";
		fp=filePath+fileName;
	}
	public void readExcel(int i) throws IOException
	{
	    File file = new File(fp);	
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook Book1 = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx"))
	    	Book1 = new XSSFWorkbook(inputStream);
	    else if(fileExtensionName.equals(".xls"))
	        Book1 = new HSSFWorkbook(inputStream);
	    Sheet Sheet1 = Book1.getSheet(sheetName);
	    rowCount = Sheet1.getLastRowNum()-Sheet1.getFirstRowNum();
	    Row row = Sheet1.getRow(i);
	    userN = row.getCell(0).getStringCellValue();
	    passW = row.getCell(1).getStringCellValue();
	    Book1.close();
	}
}
