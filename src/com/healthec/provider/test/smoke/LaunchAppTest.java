package com.healthec.provider.test.smoke;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.healthec.provider.projectspec.CreateDriver;

public class LaunchAppTest {
	
	@Test
	public void testAppLaunch()
	{
		RemoteWebDriver driver = CreateDriver.getDriver();

}
}
