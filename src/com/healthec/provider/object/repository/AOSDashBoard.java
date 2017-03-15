package com.healthec.provider.object.repository;

import org.openqa.selenium.By;

public class AOSDashBoard {
	
	public By TodaysEvents = By.xpath("//android.widget.RadioButton[@index='1']");
	public By ThisWeekEvents = By.xpath("//android.view.View[@content-desc='This Week']");
	public By LastWeekEvents = By.xpath("//android.view.View[@content-desc='Last Week']");
	public By ThisMonthEvents = By.xpath("//android.view.View[@content-desc='This Month']");
	public By LastMonthEvents = By.xpath("//android.view.View[@content-desc='Last Month']");
	

}
