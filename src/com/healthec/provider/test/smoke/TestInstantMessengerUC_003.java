package com.healthec.provider.test.smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.healthec.provider.projectspec.GetContext;
import com.healthec.provider.ui.Chatpage;

public class TestInstantMessengerUC_003 {
	
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static Chatpage cp;
	
	@BeforeTest
	public static void beforeImtest() throws Exception{
		TestdashboardUC_002.beforedashboardTC();
		//TestdashboardUC_002.testDashboardTC_001();
		driver = TestdashboardUC_002.getDriver();
		cp=new Chatpage(driver);
		}
	
	@Test(priority=1)
	public static void IMTC_001() throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = (WebDriverWait)new WebDriverWait(driver, 30);
		TestNGThread.sleep(5000);
		System.out.println("provider name :"+driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Dr.Albert')]")).getAttribute("name"));
		wait.until(ExpectedConditions.visibilityOf(cp.webView()));
		System.out.println("WEBVIEW displayed");
		GetContext.switchToContext(driver, "WEBVIEW");
	    wait.until(ExpectedConditions.elementToBeClickable(cp.chatIcon())).click();
	    GetContext.switchToContext(driver, "NATIVE_APP");
	    try{
	    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	if(wait.until(ExpectedConditions.elementToBeClickable(cp.permissionsAccept())).isDisplayed()){
	    		wait.until(ExpectedConditions.elementToBeClickable(cp.permissionsAccept())).click();
	    		wait.until(ExpectedConditions.elementToBeClickable(cp.permissionsAccept())).click();
	    	}
	    }
	    catch(Exception e){
	    	System.out.println("No permnissions required");
	    }
	    
	}
   @Test(priority=2)
   public static void IMTC_002() throws Exception{
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = (WebDriverWait)new WebDriverWait(driver, 30);
		TestNGThread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(cp.searchBtn())).click();
		wait.until(ExpectedConditions.elementToBeClickable(cp.searchBox())).sendKeys("automation");
		wait.until(ExpectedConditions.elementToBeClickable(cp.searchcancelBtn())).click();
		TestNGThread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(cp.userfilterOptions())).click();
		}
}
