package com.ciscomeraki.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessNewStadiumScreen {

	AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(WirelessAPScreen.class);

	public WirelessNewStadiumScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		logger.info("Initializing Wireless New Stadium Screen");
	}
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(accessibility = "Wireless New Stadium")
	public MobileElement mrWirelessNewStadium;

	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Model\"]")
	public MobileElement modelLabel;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Serial\"]")
	public MobileElement serailLabel;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Usage\"]")
	public MobileElement usageLabel;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Number of clients\"]")
	public MobileElement clientsLabel;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"MR34\"]")
	public MobileElement modelValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Q2FD-257W-K29Z\"]")
	public MobileElement serailValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"104 KB\"]")
	public MobileElement usageValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"1\"]")
	public MobileElement clientsValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Meraki_Api_Demo.MRDetailsView\"]")
	public MobileElement backHomeScreen;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Wireless New Stadium\"]")
	public MobileElement heading;


	
}
