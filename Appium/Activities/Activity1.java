package Activitys;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Activity1 {
	// decalre driver for android

	AppiumDriver driver;

	// create setup function
	@BeforeClass
	public void setUp() throws MalformedURLException {
		// desired capabilities

		// for android
		UiAutomator2Options options = new UiAutomator2Options();
		// for IOS
		// XCUITestOptions options1 = new XCUITestOptions();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		// options.setApp(".apk");// ipa in case of ios
		// but if we dont have any apk in android we have below 2 methods
		options.setAppPackage("com.android.calculator2");
		options.setAppActivity(".Calculator");
		options.noReset();// to prevent appium from resetting application

		// appium server url
		URL serverURL = new URL("http://localhost:4723");
		// using above two initialize driver
		driver = new AndroidDriver(serverURL, options);

	}

	// test function
	@Test
	public void addTest() {
		// find digit 5 and tap
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.id("digit_9")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		//assertions
		String res = driver.findElement(AppiumBy.accessibilityId("result")).getText();
		assertEquals(res, Integer.toString(14));

	}

	@AfterClass
	// teardown functin
	public void tearDown() {
		driver.quit();
	}
}
