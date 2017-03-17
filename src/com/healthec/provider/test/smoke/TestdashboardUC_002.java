package com.healthec.provider.test.smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.healthec.provider.ui.Dashboardpage;

public class TestdashboardUC_002 {

	
	public static RemoteWebDriver driver;
	public static Dashboardpage dp;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void beforedashboardTC() throws Exception{
		TestLoginUC_001.setUp();
		TestLoginUC_001.testloginTC_004();
		driver=TestLoginUC_001.getdriver();
		//System.out.println("driver 1 :"+driver);
		dp=new Dashboardpage(driver);
		
	}
		
	@Test
	public static void testDashboardTC_001() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = (WebDriverWait)new WebDriverWait(driver, 30);
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.todaysEvents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.thisWeekEvents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.lastWeekEvents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.thisMonthEvents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.lastMonthEvents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.admissionsOrEDvisit())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.discharged())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.documents())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.labReports())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		Thread.sleep(10000);
		
	}
	@AfterTest
	public static RemoteWebDriver getDriver(){
		return driver;
	}
	
		
}
	

