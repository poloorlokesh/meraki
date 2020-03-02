package com.ciscomeraki.tests;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ciscomeraki.pages.HomeScreen;
import com.ciscomeraki.pages.LoginScreen;
import com.ciscomeraki.pages.WirelessAP1Screen;
import com.ciscomeraki.pages.WirelessAPScreen;
import com.ciscomeraki.pages.WirelessNewStadiumScreen;
import com.ciscomeraki.pages.WirelessOtherDeskScreen;
import com.ciscomeraki.utils.AppStarter;
import com.ciscomeraki.utils.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppTests {

	AppiumDriver<MobileElement> driver = null;

	String apiKey = AppStarter.getAPiKey();

	@BeforeClass
	public void beforeClass() {
		try {
			driver = AppStarter.startApp();
		} catch (Exception exception) {
			Assert.fail("Failed to start App :" + exception.getMessage());

		}
	}

	@Test
	public void loginTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		loginFlow.login(apiKey);

		Assert.assertTrue(driver.findElementsByXPath(Constants.HOMESCREEN_NEWORKS_XPATH).size() > 0,
				"Should have atleast one networks visible");
	}

	@Test
	public void emptyApiKeyLoginTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		loginFlow.login("");

		String apnText = driver.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH).get(0).getText();

		Assert.assertEquals(Constants.HOMESCREEN_NOAPN_TEXT, apnText);
	}

	@Test
	public void invlaidApiKeyLoginTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		loginFlow.login("ciscomeraki");

		String apnText = driver.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH).get(0).getText();

		Assert.assertEquals(Constants.HOMESCREEN_NOAPN_TEXT, apnText);
	}

	@Test
	public void wrNewStadiumScreenTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		HomeScreen homeScreen = new HomeScreen(driver);

		WirelessNewStadiumScreen wsNewStdScreen = new WirelessNewStadiumScreen(driver);

		// Login into App
		loginFlow.login(apiKey);

		MobileElement Aps = driver.findElementsByXPath(Constants.HOMESCREEN_NEWORKS_XPATH).get(0);

		// Clicking Wireless New Stadium Screen
		List<MobileElement> listElements = Aps.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH);

		Assert.assertEquals(Constants.WR_NW_STD_LABEL, listElements.get(0).getText());
		Assert.assertEquals(Constants.WR_NW_STD_IP, listElements.get(1).getText());

		homeScreen.mrWirelessNewStadium.click();

		// Asserting all the values in the Screen
		Assert.assertEquals(Constants.WR_NW_STD_LABEL, wsNewStdScreen.mrWirelessNewStadium.getText());
		Assert.assertEquals(Constants.WNS_MODEL_VALUE, wsNewStdScreen.modelValue.getText());
		Assert.assertEquals(Constants.WNS_SERAIL_VALUE, wsNewStdScreen.serailValue.getText());
		Assert.assertEquals(Constants.WNS_USAGE_VALUE, wsNewStdScreen.usageValue.getText());
		Assert.assertEquals(Constants.WNS_CLIENTS_VALUE, wsNewStdScreen.clientsValue.getText());

		// Going back to homescreen
		wsNewStdScreen.backHomeScreen.click();

	}

	@Test
	public void apScreenTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		HomeScreen homeScreen = new HomeScreen(driver);

		WirelessAPScreen apScreen = new WirelessAPScreen(driver);

		// Login into App
		loginFlow.login(apiKey);

		MobileElement Aps = driver.findElementsByXPath(Constants.HOMESCREEN_NEWORKS_XPATH).get(1);

		// Clicking Wireless AP Screen
		List<MobileElement> listElements = Aps.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH);

		Assert.assertEquals(Constants.AP_LABEL, listElements.get(0).getText());
		Assert.assertEquals(Constants.AP_IP, listElements.get(1).getText());

		homeScreen.mrAP.click();

		// Asserting all the values in the Screen
		Assert.assertEquals(Constants.AP_LABEL, apScreen.mrAP.getText());
		Assert.assertEquals(Constants.AP_MODEL_VALUE, apScreen.modelValue.getText());
		Assert.assertEquals(Constants.AP_SERAIL_VALUE, apScreen.serailValue.getText());
		Assert.assertEquals(Constants.AP_USAGE_VALUE, apScreen.usageValue.getText());
		Assert.assertEquals(Constants.AP_CLIENTS_VALUE, apScreen.clientsValue.getText());

		// Going back to homescreen
		apScreen.backHomeScreen.click();

	}

	@Test
	public void wrAP1ScreenTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		HomeScreen homeScreen = new HomeScreen(driver);

		WirelessAP1Screen wrAP1Screen = new WirelessAP1Screen(driver);

		// Login into App
		loginFlow.login(apiKey);

		MobileElement Aps = driver.findElementsByXPath(Constants.HOMESCREEN_NEWORKS_XPATH).get(2);

		// Clicking Wireless AP 1 Screen
		List<MobileElement> listElements = Aps.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH);

		Assert.assertEquals(Constants.WR_AP1_LABEL, listElements.get(0).getText());
		Assert.assertEquals(Constants.WR_AP1_IP, listElements.get(1).getText());

		homeScreen.mrWirelessAP1.click();

		// Asserting all the values in the Screen
		Assert.assertEquals(Constants.WR_AP1_LABEL, wrAP1Screen.wrAP1.getText());
		Assert.assertEquals(Constants.WR_AP1_MODEL_VALUE, wrAP1Screen.modelValue.getText());
		Assert.assertEquals(Constants.WR_AP1_SERAIL_VALUE, wrAP1Screen.serailValue.getText());
		Assert.assertEquals(Constants.WR_AP1_USAGE_VALUE, wrAP1Screen.usageValue.getText());
		Assert.assertEquals(Constants.WR_AP1_CLIENTS_VALUE, wrAP1Screen.clientsValue.getText());

		// Going back to homescreen
		wrAP1Screen.backHomeScreen.click();

	}

	@Test
	public void wrWROtherDeskScreenTest() {

		LoginScreen loginFlow = new LoginScreen(driver);

		HomeScreen homeScreen = new HomeScreen(driver);

		WirelessOtherDeskScreen wrOtherDesk = new WirelessOtherDeskScreen(driver);

		// Login into App
		loginFlow.login(apiKey);

		MobileElement Aps = driver.findElementsByXPath(Constants.HOMESCREEN_NEWORKS_XPATH).get(3);

		// Clicking Wireless Other Desk Screen
		List<MobileElement> listElements = Aps.findElementsByXPath(Constants.HOMESCREEN_NONETWORKS_XPATH);

		Assert.assertEquals(listElements.get(0).getText(), Constants.WR_OTHER_DESK_LABEL);
		Assert.assertEquals(listElements.get(1).getText(), Constants.WR_OTHER_DESK_IP);

		homeScreen.mrWirelessOtherDesk.click();

		// Asserting all the values in the Screen
		Assert.assertEquals(Constants.WR_OTHER_DESK_LABEL, wrOtherDesk.mrWROtherDesk.getText());
		Assert.assertEquals(Constants.WR_OTHER_DESK_MODEL_VALUE, wrOtherDesk.modelValue.getText());
		Assert.assertEquals(Constants.WR_OTHER_DESK_SERAIL_VALUE, wrOtherDesk.serailValue.getText());
		Assert.assertEquals(Constants.WR_OTHER_DESK_USAGE_VALUE, wrOtherDesk.usageValue.getText());
		Assert.assertEquals(Constants.WR_OTHER_DESK_CLIENTS_VALUE, wrOtherDesk.clientsValue.getText());

		// Going back to homescreen
		wrOtherDesk.backHomeScreen.click();

	}

	@AfterMethod
	public void afterMethod() {
		driver.closeApp();
		driver.launchApp();
	}

	@AfterClass
	public void afterClass() throws IOException {
		driver.closeApp();
		driver.quit();
	}
}
