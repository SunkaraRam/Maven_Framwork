package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class OragneHRM {
	
	WebDriver driver;
	
	public static String url = "http://orangehrm.qedgetech.com";
	
	FileInputStream fi;
	
	FileOutputStream fo;
	
	Workbook wb ; 
	
	Sheet ws;
	
	Row r;
	
	Cell c;
	
	ExtentReports report;
	
	ExtentTest test;
	
	@BeforeTest
	
	public void launcH() {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
	}

	@Test
	public void ram() throws FileNotFoundException {
		//fi = new FileInputStream("Sunquest Information Systems ");
		//wb=Workboo

	}
	
	@AfterTest
	public void closE() {
		
		driver.close();
		
	}
	

}
