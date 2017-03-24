package com.healthec.provider.projectspec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Tabs {
	
	public static void menutabs(RemoteWebDriver driver,String name)throws Exception{
		
		List<WebElement> menutabs =driver.findElements(By.className("m_navigationwrap"));
		for(int i = 0; i < menutabs.size(); ++i) {
			
			WebElement tab = menutabs.get(i).findElement(By.id(name));
			tab.click();

	}
	}
}
