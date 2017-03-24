package com.healthec.provider.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSSwipe;

public class SwipePage {
	
	RemoteWebDriver driver;
	String instanceName;
	AOSSwipe aos = new AOSSwipe();
	
	public String horizontal(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.horizontal);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String vertical(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.vertical);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}

}
