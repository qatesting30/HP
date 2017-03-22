package com.healthec.provider.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.healthec.provider.ui.Dashboardpage;

public class TestdashboardUC_001 {

	
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
		wait.until(ExpectedConditions.elementToBeClickable(dp.todaysEvents())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.thisWeekEvents())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.lastWeekEvents())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.thisMonthEvents())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.lastMonthEvents())).click();
		TestNGThread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.admissionsOrEDvisit())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		TestNGThread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.admissionsOrEDvisit())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		TestNGThread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.admissionsOrEDvisit())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		TestNGThread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dp.admissionsOrEDvisit())).click();
		wait.until(ExpectedConditions.elementToBeClickable(dp.backbutton())).click();
		TestNGThread.sleep(5000);
		
	}
		
		
}
	

