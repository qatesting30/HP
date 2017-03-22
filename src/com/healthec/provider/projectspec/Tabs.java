package com.healthec.provider.projectspec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.healthec.provider.object.repository.AOSMenuTabs;
import com.healthec.provider.ui.menuTabs;

public class Tabs {
	
	AOSMenuTabs aos=new AOSMenuTabs();
	
	public static void menutabs(RemoteWebDriver driver,String element)throws Exception{
		
		List<WebElement> menutabs =driver.findElements(By.className("m_navigationwrap"));
		for(int i = 0; i < menutabs.size(); ++i) {
			WebElement tabs = menutabs.get(i).findElement(aos.)
		     tabs.click();
		}
	}
}
