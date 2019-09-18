package PomOrange12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LogionHome extends HomeApp{

	@FindBy(id = "txtUsername") WebElement uid;
	
	@FindBy(id="txtPassword") WebElement pwd;
	
	@FindBy(id="btnLogin") WebElement lg;
	
	@FindBy(id = "welcome") WebElement wel;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement lout;
	
	public boolean starT(String username,String password) 
	{ 
	
		uid.sendKeys(username);
		
		pwd.sendKeys(password);
		
		lg.click();
		
		if (driver.findElement(By.id("welcome")).isDisplayed()) {
			
			return true;
			
		} else {

			return false;
		}
		
	}

	
	public boolean logOut() {
		
		wel.click();
		
		lout.click();
		
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
		
			return true;
		} else {
			return false;
		}
		
		
	}
	
}
