package com.healthec.provider.test.smoke;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.healthec.provider.generic.utils.ScreenSwipe;
import com.healthec.provider.projectspec.GetContext;
import com.healthec.provider.projectspec.Tabs;
import com.healthec.provider.test.functional.TestdashboardUC_002;
import com.healthec.provider.ui.menuTabs;

public class TestMenuUC_004 {
	
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static menuTabs mt;
	public static List<WebElement> tabs; 
	
	@BeforeTest
	public static void beforeTestMenu() throws Exception{
		TestdashboardUC_002.beforedashboardTC();
		driver=TestLoginUC_001.getdriver();
		mt= new menuTabs(driver);
	}
	@Test(priority=1)
	public static void testMenuTC_001(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    GetContext.switchToContext(driver, "WEBVIEW");
        wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
        
	}
	//@Test(priority=2)
	public static void testMenuTC_002() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    Tabs.menutabs(driver, mt.homeTab());
	  
	    
	    
	 }
	//@Test(priority=3)
	public static void testMenuTC_003() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    Tabs.menutabs(driver, mt.myPatientList());
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	    
	}
	//@Test(priority=4)
	public static void testMenuTC_004() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    Tabs.menutabs(driver, mt.settings());
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=5)
	public static void testMenuTC_005() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    Tabs.menutabs(driver, mt.calculator());
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=6)
	public static void testMenuTC_006() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    Tabs.menutabs(driver, mt.help());
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=7)
	public static void testMenuTC_007() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    Tabs.menutabs(driver, mt.contactUs());
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	@Test(priority=8)
	public static void testMenuTC_008() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	  /*  GetContext.switchToContext(driver, "NATIVE");
	    ScreenSwipe.swipeScreen(driver, mt.vertical());*/
	    GetContext.switchToContext(driver, "WEBVIEW");
	    Tabs.menutabs(driver, mt.logOut());
	    
	    
	    //changes
	    
	}
	    

}
