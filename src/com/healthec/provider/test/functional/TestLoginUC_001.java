package com.healthec.provider.test.functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.healthec.provider.projectspec.CreateDriver;
import com.healthec.provider.ui.Loginpage;

public class TestLoginUC_001 {
	
	public static RemoteWebDriver driver;
	public static Loginpage lp;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void setUp(){
		driver = CreateDriver.getDriver();
	     lp = new Loginpage(driver);
	}
   @Test(priority=4)
   public static void testloginTC_004() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   lp.userNameTxtfld().sendKeys("healthecpec");
	   lp.passwordTxtfld().sendKeys("Password@1");
	   lp.loginBtn().click();
	   
	  /* try{
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 if(lp.invalidCredentials().isDisplayed()) 
		 {
			 System.out.println(lp.invalidCredentials().getText());
		 }
	   }
	   catch(Exception e){
		   System.out.println("exception in: "+e.getMessage());
	   }*/
	}
 //  @Test(priority=1)
   public static void testloginTC_001() throws InterruptedException{
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   lp.getContactUsLink().click();
	   String actual=driver.findElement(By.xpath("//android.view.View[@content-desc='Drop us an Email']")).getText();
	   //System.out.println(actual);
	   String expected = "Drop us an Email";
       if(expected.contains(actual)){
    	   System.out.println("contact us page displayed");
       }
       driver.navigate().back();
	  }
  // @Test(priority=2)
   public static void testloginTC_002() throws InterruptedException{
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   lp.getprivacyPolicyLink().click();
	   String actual=driver.findElement(By.xpath("//android.view.View[@content-desc='PRIVACY POLICY']")).getText();
	  // System.out.println(actual);
	   String expected = "PRIVACY POLICY";
       if(expected.contains(actual)){
    	   System.out.println("Privacy page displayed");
       }
       driver.navigate().back();
	  }
  // @Test(priority=3)
   public static void testloginTC_003() throws InterruptedException{
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   lp.gettermsOfUseLink().click();
	   String actual=driver.findElement(By.xpath("//android.view.View[@content-desc='TERMS OF USE']")).getText();
	 //  System.out.println(actual);
	   String expected = "TERMS OF USE";
       if(expected.contains(actual)){
    	   System.out.println("Terms of use page displayed");
       }
       driver.navigate().back();
	  }
   @AfterTest
   public static RemoteWebDriver getdriver(){
	   System.out.println("driver value :"+driver);
	   return driver;
	   
   }
}
