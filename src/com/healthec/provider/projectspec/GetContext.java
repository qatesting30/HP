package com.healthec.provider.projectspec;

import java.util.Set;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class GetContext {
	
	public static RemoteWebDriver driver;
    public static String instanceName;
	
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void switchToContext(RemoteWebDriver driver,String contextinstance){
	  
	  instanceName = driver.getClass().getName();
	  if(instanceName.contains("AndroidDriver")){
		  AndroidDriver driver1 = (AndroidDriver)driver;
		  Set<String>availContexts = driver1.getContextHandles();
		  System.out.println("available contexts :"+availContexts);
		  for(String context : availContexts){
			  if(context.contains(contextinstance)){
				  driver1.context(contextinstance);
				  
			  }
		  }
		  
	  }
	  else if (instanceName.contains("IOSDriver")){
		  IOSDriver driver2 = (IOSDriver)driver;
		  Set<String>availContexts = driver2.getContextHandles();
		  System.out.println("available contexts :"+availContexts);
		  for(String context : availContexts){
			  if(context.contains(contextinstance)){
				  driver2.context(contextinstance);
			  }
		  }
	  }
				  
  }

}
