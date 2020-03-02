package com.ciscomeraki.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppStarter {

	private static AppConfig appConfig = new AppConfig();

	private static Properties properties = new Properties();

	private static AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(AppStarter.class);

	static {

		properties = PropertyUtils.readConfigFile(Constants.CONFIG_FILE_PATH);
		appConfig.setPlatformName(properties.getProperty("platformName"));
		appConfig.setPlatformVersion(properties.getProperty("platformVersion"));
		appConfig.setDeviceName(properties.getProperty("deviceName"));
		appConfig.setApp(properties.getProperty("app"));
		appConfig.setAppiumServer(properties.getProperty("appiumServer"));
		appConfig.setApiKey(properties.getProperty("apiKey"));
		appConfig.setTimeout(properties.getProperty("timeout"));
		appConfig.setUDID(properties.getProperty("UDID"));
		
		
		

	}

	public static AppiumDriver<MobileElement> startApp() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, appConfig.getPlatformName());
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, appConfig.getPlatformVersion());
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, appConfig.getDeviceName());
		desiredCapabilities.setCapability(MobileCapabilityType.APP, appConfig.getApp());
		desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, appConfig.getTimeout());
		desiredCapabilities.setCapability(Constants.KEYBOARD_SETTING, false);

		URL url = new URL(appConfig.getAppiumServer());

		if (appConfig.getPlatformName().equalsIgnoreCase(Constants.ANDROID_PLATFORM_NAME)) {
			logger.info("Starting on Android Platform");
			driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
		} else if (appConfig.getPlatformName().equalsIgnoreCase(Constants.IOS_PLATFORM_NAME)) {
			desiredCapabilities.setCapability(Constants.AUTOMATION_NAME, Constants.AUTOMATION_VALUE);
			logger.info("Starting on IOS Platform");
			driver = new IOSDriver<MobileElement>(url, desiredCapabilities);
		} else {
			logger.error("Invalid Platform Name, currently it supports only IOS or Android");
		}

		logger.info("Test Settings :" + appConfig.toString());
		driver.manage().timeouts().implicitlyWait(Long.valueOf(appConfig.getTimeout()), TimeUnit.SECONDS);

		return driver;
	}

	public static String getAPiKey() {
		return appConfig.getApiKey();
	}

	public static String getTimeout() {
		return appConfig.getTimeout();
	}
	
	

}
