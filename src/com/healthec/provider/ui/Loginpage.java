package com.healthec.provider.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSLoginPage;

public class Loginpage {

	RemoteWebDriver driver;
	String instanceName;
	AOSLoginPage aos=new AOSLoginPage();
	
	public Loginpage(RemoteWebDriver driver){
		this.driver=driver;
		instanceName = driver.getClass().getName();
	}
	
	public WebElement userNameTxtfld ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.userNameTxtfld);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	public WebElement passwordTxtfld ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.pwdTxtfld);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	public WebElement loginBtn ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.loginBtn);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	public WebElement getContactUsLink ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.contactUslink);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	public WebElement getprivacyPolicyLink ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.privacyPolicylink);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	public WebElement gettermsOfUseLink ()
	{
		if(instanceName.contains("AndroidDriver"))
			return driver.findElement(aos.termsOfUselink);
		/*else if(instanceName.contains("IOSDriver"))
			return driver.findElement(ios.searchTextbox);*/
		return null;
	}
	 public WebElement invalidCredentials(){
		  // System.out.println("instance name1 :"+instanceName);
		   if(instanceName.contains("AndroidDriver"))
			 //  System.out.println("driver 3 :"+driver);
			  return driver.findElement(aos.invalidCredentials);
		   
			/*else if(instanceName.contains("IOSDriver"))
				return driver.findElement(ios.searchTextbox);*/
			return null;
	   }
}
