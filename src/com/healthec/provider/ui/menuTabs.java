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
	public String homeTab(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.landingPageTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String myPatientList(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.patientListTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String settings(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.settingsTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String calculator(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.calculatorTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String help(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.helpTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String contactUs(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.contactTab);
		/*else if (instanceName.contains("IOSDriver"))
			return driver.findElement(ios.menutabs);*/
		return null;
	}
	public String logOut(){
		if(instanceName.contains("AndroidDriver"))
			return (aos.logOutTab);
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
