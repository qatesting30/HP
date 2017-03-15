package com.healthec.provider.projectspec;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.generic.utils.getData;

import io.appium.java_client.android.AndroidDriver;

public class CreateDriver {
	
	public static RemoteWebDriver getDriver(){
		String env = getData.fromProperties("config", "environment");
		String platformName  = getData.fromProperties("config"+env, "platformName");
		String platformVersion = 
				getData.fromProperties("config"+env, "platformVersion");
		String appPackage = getData.fromProperties("config"+env, "appPackage");
		String appActivity = getData.fromProperties("config"+env, "appActivity");
		String deviceName = getData.fromProperties("config"+env, "deviceName");
		String appiumURL = getData.fromProperties("config"+env, "appiumURL");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
		cap.setCapability("deviceName", deviceName);
		
		RemoteWebDriver driver=null;
		if(env.contains("AOS")){
			try {
				driver=new AndroidDriver(new URL(appiumURL),cap);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	return driver;
	}
}
