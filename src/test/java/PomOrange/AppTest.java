package PomOrange;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PomOrange12.Adminlogout;
import PomOrange12.HomeApp;
import PomOrange12.LogionHome;

public class AppTest extends HomeApp{

	@Test(priority=1)
	public void Testing11() {
		
		LogionHome lg = PageFactory.initElements(driver, LogionHome.class );
		
		boolean rs =lg.starT("Admin","Qedge123!@#");
		
		if (rs) {
			
			Assert.assertTrue(rs);
		}
		
		if (rs) 
		{
			
			lg.logOut();
			
		}
		
		
	}
	
	@Test(priority=2)
	public void Testing22() {
		
		LogionHome lg = PageFactory.initElements(driver, LogionHome.class);
		
		Adminlogout al = PageFactory.initElements(driver, Adminlogout.class);
		
		boolean rs2=lg.starT("Admin", "Qedge123!@#");
		
		System.out.println(rs2);
		
		Assert.assertTrue(rs2);
			
		if (rs2) {
			
			Assert.assertTrue(rs2);
			
		}
		
		if (rs2) {
			
			lg.logOut();
			
		}
		
		
	}
	
	@Test(priority=3)
	public void Testing33() {
		
		LogionHome lg = PageFactory.initElements(driver, LogionHome.class );
		
		boolean rs3 =lg.starT("Admin","Qedge123!@#");
		
		if (rs3) {
		
			Assert.assertTrue(rs3);
		}
		
		if (rs3) {
		
			lg.logOut();	
			
			
		}
		
	}
	
	
}
