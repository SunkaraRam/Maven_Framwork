package PomOrange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeNow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/flights ");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		int ram = radio.size();
		
		//System.out.println(ram);
			
			driver.findElement(By.id("DepartDate")).click();
			
			String expy = "2020";
			
			String acty =driver.findElement(By.className("ui-datepicker-year")).getText();
			
			while (!acty.equalsIgnoreCase(expy)) {
				
				driver.findElement(By.className("nextMonth ")).click();
				
				acty =driver.findElement(By.className("ui-datepicker-year")).getText();
				
			}
			
			
			
			String exp = "October";
			
			String act =driver.findElement(By.className("ui-datepicker-month")).getText();
			
			while (!act.equalsIgnoreCase(exp)) {
				
				driver.findElement(By.className("nextMonth ")).click();
				
				act =driver.findElement(By.className("ui-datepicker-month")).getText();
				
			}
			
			WebElement cal = driver.findElement(By.className("calendar"));
			
			List<WebElement> rows,cols;
			
			String dt = "309+8lkjhnbgvfcxz";
			
			rows = cal.findElements(By.tagName("tr"));
			
			int rc =rows.size();
			
			boolean flag = false;
			
			for (int i = 0; i < rc; i++) {
				
				cols = rows.get(i).findElements(By.tagName("td"));
				
				for (int j = 0; j < cols.size(); j++) {
					
					String data = cols.get(j).getText();
					
					if (data.equals(dt)) {
						
						cols.get(j).click();
						flag =true;
						break;
						
					}
					
				}
				
				if (flag) {
					
					break;
					
				}
				
			}

	
		//driver.close();
	
	}
	

}