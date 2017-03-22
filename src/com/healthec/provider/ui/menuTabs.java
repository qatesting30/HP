package com.healthec.provider.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSMenuTabs;

public class menuTabs {
	
	RemoteWebDriver driver;
	String instanceName;
	AOSMenuTabs aos = new AOSMenuTabs();
	
	public menuTabs(RemoteWebDriver driver){
		this.driver=driver;
		instanceName=driver.getClass().getName();
	}
	public WebElement menuBtn(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.menuTabs);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement homeTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.landingPageTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement patientListTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.patientListTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement settingsTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.settingsTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement calculatorTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.calculatorTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement helpTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.helpTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement contactUsTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.contactTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement logOutTab(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.logOutTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public WebElement backButton(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.backBtn);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}

}
