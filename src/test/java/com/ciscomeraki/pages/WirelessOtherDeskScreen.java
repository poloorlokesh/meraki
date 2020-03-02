package com.ciscomeraki.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessOtherDeskScreen {

	AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(WirelessAPScreen.class);

	public WirelessOtherDeskScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		logger.info("Initializing Wireless Other Desktop Screen");

	}
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(accessibility = "Wireless other desk")
	public MobileElement mrWROtherDesk;

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
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Q2FD-TR63-PBC2\"]")
	public MobileElement serailValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"53 KB\"]")
	public MobileElement usageValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"2\"]")
	public MobileElement clientsValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Meraki_Api_Demo.MRDetailsView\"]")
	public MobileElement backHomeScreen;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Wireless other desk\"]")
	public MobileElement heading;


	
}
