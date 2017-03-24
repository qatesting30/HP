package com.healthec.provider.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSMyPatientList;

public class MypatientListPage {
	
	RemoteWebDriver driver;
	String InstanceName;
	AOSMyPatientList aos = new AOSMyPatientList();
	
	public MypatientListPage(RemoteWebDriver driver){
		this.driver=driver;
		InstanceName=driver.getClass().getName();
	}
	public WebElement Firstname(){
		if(InstanceName.contains("AndroidDriver"))
			return driver.findElement(aos.Firstname);
		/*else if(InstanceName.contains("IOSDriver"))
			return driver.findElement(aos.Firstname);*/
		return null;
	}
	public WebElement lastName(){
		if(InstanceName.contains("AndroidDriver"))
			return driver.findElement(aos.LastName);
		/*else if(InstanceName.contains("IOSDriver"))
			return driver.findElement(aos.Firstname);*/
		return null;
	}

}
