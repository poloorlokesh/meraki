package com.ciscomeraki.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen {
	
	AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(HomeScreen.class);
	
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		logger.info("Initailizing HomeScreen");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@iOSXCUITFindBy(accessibility = "MR - Wireless New Stadium")
	@AndroidFindBy(xpath="android xpath")
	public MobileElement mrWirelessNewStadium;

	@iOSXCUITFindBy(accessibility = "MR - AP")
	@AndroidFindBy(xpath="android xpath")
	public MobileElement mrAP;
	
	@iOSXCUITFindBy(accessibility = "MR - Wireless AP 1")
	@AndroidFindBy(xpath="android xpath")
	public MobileElement mrWirelessAP1;

	@iOSXCUITFindBy(accessibility = "MR - Wireless other desk")
	@AndroidFindBy(xpath="android xpath")
	public MobileElement mrWirelessOtherDesk;
	
}
