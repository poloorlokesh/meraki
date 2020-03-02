# meraki
This project is for Cisco Meraki assignment

Steps to Run : 

1) git clone using Https/ssh or download folder
2) Go to project level (where pom.xml exists)
3) Provide required properties in config.properties.
4) mvn clean install -U


Note1: Currently this code is tested for IOS platform.
In order to work in Android platform, have to update the current Android xpath in the Page/Screen objects.

Note2: Currently added everything, If the Simulator exists and Appium installed, follows the above steps and add the APP path alone. 
It should run without any issues on IOS.


Test Cases

1) Login with valid API Key and check it lands into homescreen
2) Login with empty API Key and check no items shows up.
3) Login with invalid API Key and check no items shows up. 
4) Valid Home Screen, verify the following items are shows up. (Added part of other tests)
	1) Wireless New Stadium Screen
	2) Wireless Other Desktop Screen
	3) Wireless AP 1 Screen
	4) AP Screen
5) Valid the content in Wireless New Stadium Screen.
6) Valid the content in Wireless Other Desktop Screen.
7) Valid the content in Wireless AP Screen
8) Valid the content in AP Screen.


Technical Softwares/Frameworks/Tools:
1) Java is the programming language use to code the tests.
2) Appium framework to interact with Simulator.
3) TestNg for report and tests organization.
4) Maven for build.


Other Testing factors:
1) All positive use cases.
2) Negative use cases.
3) Security testing.
4) Load testing
5) Real device testing for some use cases instead of simulators.
 

