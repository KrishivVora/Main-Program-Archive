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
public class MyClass5
{
	String filePath, fileName, sheetName, userN, passW, fp;
	static int rowCount;
	MyClass5()
	{
		filePath="D:\\";
		fileName="Book2.xlsx";
		sheetName="Sheet2";
		userN="";
		passW="";
		fp=filePath+fileName;
	}
	public void readExcel(int i) throws IOException
	{
	    File file = new File(fp);	
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook Book2 = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx"))
	    	Book2 = new XSSFWorkbook(inputStream);
	    else if(fileExtensionName.equals(".xls"))
	        Book2 = new HSSFWorkbook(inputStream);
	    Sheet Sheet2 = Book2.getSheet(sheetName);
	    rowCount = Sheet2.getLastRowNum()-Sheet2.getFirstRowNum();
	    rowCount += 1;
	    Row row = Sheet2.getRow(i);
	    userN = row.getCell(0).getStringCellValue();
	    passW = row.getCell(1).getStringCellValue();
	    Book2.close();
	}
}
