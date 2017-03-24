package com.healthec.provider.generic.utils;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class ScreenSwipe {
	
	 public static String instanceName; 
	@SuppressWarnings("rawtypes")
	public static void swipeHorizontal(RemoteWebDriver driver){
		instanceName=driver.getClass().getName();
		System.out.println("instance :"+driver.getClass().getName());
		if(instanceName.contains("AndroidDriver")){
				AndroidDriver driver1=(AndroidDriver)driver;
				Dimension sc= driver1.manage().window().getSize();
				int ht = sc.getHeight();
				int wd = sc.getWidth();
				
				int startx = (int)(wd *0.8);
				int endx = (int)(wd*0.2);
				int starty  = (int)(ht/2);
				int endy  = (int)(ht/2);
				driver1.swipe(startx, starty, endx, endy, 4000);
				}
			else if (instanceName.contains("IOSDriver")){
				System.out.println("Not yet implemented");
			}
	}
		@SuppressWarnings("rawtypes")
		public static void swipeVertical(RemoteWebDriver driver){
			instanceName=driver.getClass().getName();
			//System.out.println("instance :"+driver.getClass().getName());
			if(instanceName.contains("AndroidDriver")){
				AndroidDriver driver1=(AndroidDriver)driver;
				Dimension sc= driver1.manage().window().getSize();
				int ht = sc.getHeight();
				int wd = sc.getWidth();
				
				int startx = (int)(wd/2);
				int endx = (int)(wd/2);
				int starty  = (int)(ht *0.8);
				int endy  = (int)(ht *0.2);
				driver1.swipe(startx, starty, endx, endy, 4000);
				}
			else if (instanceName.contains("IOSDriver")){
				System.out.println("Not yet implemented");
			}
		}
	}


