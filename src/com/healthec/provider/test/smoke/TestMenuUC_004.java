package com.healthec.provider.test.smoke;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.healthec.provider.projectspec.GetContext;
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
	@Test(priority=2)
	public static void testMenuTC_002(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	   // Tabs.menutabs(driver, mt.homeTab());
	    
	    
	 }
	//@Test(priority=3)
	public static void testMenuTC_003(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.patientListTab())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	    
	}
	//@Test(priority=4)
	public static void testMenuTC_004(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.settingsTab())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=5)
	public static void testMenuTC_005(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.calculatorTab())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=6)
	public static void testMenuTC_006(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.contactUsTab())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=7)
	public static void testMenuTC_007(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.helpTab())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.backButton())).click();
	}
	//@Test(priority=8)
	public static void testMenuTC_008(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    wait=(WebDriverWait)new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
	    wait.until(ExpectedConditions.elementToBeClickable(mt.logOutTab())).click();
	    
	}
	    

}
