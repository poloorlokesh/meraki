package com.ciscomeraki.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WirelessAP1Screen {

	AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(WirelessAP1Screen.class);

	public WirelessAP1Screen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		logger.info("Initializing WirelessAP1Screen");

	}
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(accessibility = "Wireless AP 1")
	public MobileElement wrAP1;

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
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Q2FD-FTZE-5EQ4\"]")
	public MobileElement serailValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"161 KB\"]")
	public MobileElement usageValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"1\"]")
	public MobileElement clientsValue;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Meraki_Api_Demo.MRDetailsView\"]")
	public MobileElement backHomeScreen;
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Wireless AP 1\"]")
	public MobileElement heading;


	
}
