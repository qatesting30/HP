package com.healthec.provider.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.healthec.provider.generic.utils.ScreenSwipe;
import com.healthec.provider.projectspec.GetContext;
import com.healthec.provider.projectspec.Tabs;
import com.healthec.provider.ui.MypatientListPage;
import com.healthec.provider.ui.SwipePage;
import com.healthec.provider.ui.menuTabs;

public class TestMyPatientListUC_003 {
	
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static MypatientListPage mp;
	public static menuTabs mt;
	public static SwipePage sp;
	
	
	@BeforeTest
	public static void BeforeMyPatientListTest() throws Exception{
		TestdashboardUC_002.beforedashboardTC();
		driver=TestdashboardUC_002.getDriver();
		mp=new MypatientListPage(driver);
		mt=new menuTabs(driver);
		}
	
	@Test
	public static void MyPatientListTestTC_001() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = (WebDriverWait) new WebDriverWait(driver, 30);
		GetContext.switchToContext(driver, "WEBVIEW");
		wait.until(ExpectedConditions.elementToBeClickable(mt.menuBtn())).click();
		Tabs.menutabs(driver,mt.myPatientList());
		wait.until(ExpectedConditions.elementToBeClickable(mp.Firstname())).sendKeys("FName");
		wait.until(ExpectedConditions.elementToBeClickable(mp.lastName())).sendKeys("LName");
		GetContext.switchToContext(driver, "NATIVE_APP");
		ScreenSwipe.swipeVertical(driver);
		GetContext.switchToContext(driver, "WEBVIEW");
		wait.until(ExpectedConditions.elementToBeClickable(mp.searchBtn())).click();
		
	}

}
