package com.ciscomeraki.utils;

public interface Constants {

	// Config Path
	String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/config/config.properties";

	// Desired Capabilities
	String KEYBOARD_SETTING = "connectHardwareKeyboard";
	String AUTOMATION_NAME = "automationName";
	String AUTOMATION_VALUE = "XCUITest";

	// Platforms
	String IOS_PLATFORM_NAME = "IOS";
	String ANDROID_PLATFORM_NAME = "ANDROID";

	// Page Identifiers
	String HOMESCREEN_NEWORKS_XPATH = "//XCUIElementTypeCell";
	String HOMESCREEN_NONETWORKS_XPATH = "//XCUIElementTypeStaticText";
	String HOMESCREEN_NOAPN_TEXT = "0  APs";

	// Wireless New Stadium Identifiers
	String WR_NW_STD_LABEL = "Wireless New Stadium";
	String WR_NW_STD_IP = "172.29.6.100";
	String WNS_MODEL_VALUE = "MR34";
	String WNS_SERAIL_VALUE = "Q2FD-257W-K29Z";
	String WNS_USAGE_VALUE = "104 KB";
	String WNS_CLIENTS_VALUE = "1";

	// AP Identifiers
	String AP_LABEL = "AP";
	String AP_IP = "172.29.6.126";
	String AP_MODEL_VALUE = "MR34";
	String AP_SERAIL_VALUE = "Q2FD-JVAE-348F";
	String AP_USAGE_VALUE = "0 KB";
	String AP_CLIENTS_VALUE = "1";

	// Wireless AP1 Identifiers
	String WR_AP1_LABEL = "Wireless AP 1";
	String WR_AP1_IP = "172.29.6.107";
	String WR_AP1_MODEL_VALUE = "MR34";
	String WR_AP1_SERAIL_VALUE = "Q2FD-FTZE-5EQ4";
	String WR_AP1_USAGE_VALUE = "161 KB";
	String WR_AP1_CLIENTS_VALUE = "1";

	// Wireless Other Desk Identifiers
	String WR_OTHER_DESK_LABEL = "Wireless other desk";
	String WR_OTHER_DESK_IP = "172.29.6.43";
	String WR_OTHER_DESK_MODEL_VALUE = "MR34";
	String WR_OTHER_DESK_SERAIL_VALUE = "Q2FD-TR63-PBC2";
	String WR_OTHER_DESK_USAGE_VALUE = "53 KB";
	String WR_OTHER_DESK_CLIENTS_VALUE = "2";

}
