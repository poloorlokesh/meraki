/**
 * 
 */
package com.ciscomeraki.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginScreen {

	AppiumDriver<MobileElement> driver;

	private static Logger logger = LogManager.getLogger(LoginScreen.class);
	
	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"apiKeyTxt\"]")
	public MobileElement apiKeyText;

	@AndroidFindBy(xpath="android xpath")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Go\"]")
	public MobileElement goButton;

	public LoginScreen(AppiumDriver<MobileElement> driver) {
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		logger.info("Initializing Login Screen");
	}
	
	public void login(String apiKey) {

		logger.debug("Logging in ");

		apiKeyText.clear();

		apiKeyText.sendKeys(apiKey);

		driver.hideKeyboard();

		goButton.click();

	}
	
	

}
