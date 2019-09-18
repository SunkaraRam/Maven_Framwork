package PomOrange12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class HomeApp {
	
	public static String url = "http://orangehrm.qedgetech.com";
	
	public static WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void appLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	@AfterSuite
	public void appClose() {
		
		driver.close();
		
	}
	
	

}
