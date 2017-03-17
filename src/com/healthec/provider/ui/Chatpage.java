package com.healthec.provider.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSChatPage;

public class Chatpage {
	
	RemoteWebDriver driver;
	String instanceName ;
	AOSChatPage aos = new AOSChatPage();
	
	public Chatpage(RemoteWebDriver driver){
		this.driver = driver;
		instanceName = driver.getClass().getName();
	}
	
	public WebElement chatIcon(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.chatIcon);
		/*else if(instanceName.contains("IOSDriver"))
		return driver.findElement(ios.searchTextbox);*/
	return null;
	}
	public WebElement searchBtn(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.searchBtn);
		/*else if(instanceName.contains("IOSDriver"))
		return driver.findElement(ios.searchTextbox);*/
	return null;
	}
	public WebElement searchBox(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.searchBox);
		/*else if(instanceName.contains("IOSDriver"))
		return driver.findElement(ios.searchTextbox);*/
	return null;
	}
	public WebElement searchcancelBtn(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.searchCancelBtn);
		/*else if(instanceName.contains("IOSDriver"))
		return driver.findElement(ios.searchTextbox);*/
	return null;
	}
	public WebElement userfilterOptions(){
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.userFilter);
		/*else if(instanceName.contains("IOSDriver"))
		return driver.findElement(ios.searchTextbox);*/
	return null;
	}
}