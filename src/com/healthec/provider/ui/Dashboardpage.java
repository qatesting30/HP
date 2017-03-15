package com.healthec.provider.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSDashBoard;

public class Dashboardpage {
	
	RemoteWebDriver driver;
	String instanceName;
	AOSDashBoard aos=new AOSDashBoard();
	
	public Dashboardpage(RemoteWebDriver driver){
		//System.out.println("driver 2 :"+driver);
		this.driver=driver;
		instanceName = driver.getClass().getName();
		//System.out.println("instance name :"+instanceName);
	}
   public WebElement todaysEvents(){
	   if(instanceName.contains("AndroidDriver"))
		   return driver.findElement(aos.TodaysEvents);
		
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
   }
   public WebElement thisWeekEvents(){
	  // System.out.println("instance name1 :"+instanceName);
	   if(instanceName.contains("AndroidDriver"))
		 //  System.out.println("driver 3 :"+driver);
		  return driver.findElement(aos.ThisWeekEvents);
	   
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
   }
   public WebElement lastWeekEvents(){
	   if(instanceName.contains("AndroidDriver"))
		   return driver.findElement(aos.LastWeekEvents);
		
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
   }
   public WebElement thisMonthEvents(){
	   if(instanceName.contains("AndroidDriver"))
		   return driver.findElement(aos.ThisMonthEvents);
		
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
   }
   public WebElement lastMonthEvents(){
	   if(instanceName.contains("AndroidDriver"))
		   return driver.findElement(aos.LastMonthEvents);
		
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
   }
  
}
