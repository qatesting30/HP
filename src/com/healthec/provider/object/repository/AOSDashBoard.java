package com.healthec.provider.object.repository;

import org.openqa.selenium.By;

public class AOSDashBoard {
	
	public By TodaysEvents = By.xpath("(//android.widget.RadioButton)[1]");
	public By ThisWeekEvents = By.xpath("//android.view.View[@content-desc='This Week']");
	public By LastWeekEvents = By.xpath("//android.view.View[@content-desc='Last Week']");
	public By ThisMonthEvents = By.xpath("//android.view.View[@content-desc='This Month']");
	public By LastMonthEvents = By.xpath("//android.view.View[@content-desc='Last Month']");
	public By admissionsOrEDvisits = By.xpath("//android.view.View[contains(@content-desc,'Admission(s) or ED visit(s)')]");
	public By discharged = By.xpath("//android.view.View[contains(@content-desc,'Patient(s) Discharged')]");
	public By documents = By.xpath("//android.view.View[contains(@content-desc,'Documents')]");
	public By labReports = By.xpath("//android.view.View[contains(@content-desc,'Patient(s) Received Lab Reports')]");
	public By backbtn = By.name("back button");
	

}
