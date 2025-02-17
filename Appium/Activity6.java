package Activitys;

import java.awt.Dimension;
import org.openqa.selenium.Point;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import static Activitys.ActivityBase.*;
import static org.testng.Assert.assertTrue;;


public class Activity6 {
	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException
	{// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.chrome.Main");
		options.setAppActivity("com.android.chrome");

		// Server Address
		URL serverURL = new URI("http://localhost:4723").toURL();
		// Driver Initialization
		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/sliders");
	}
	@Test
	public void testVolume75()
	{

		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
		org.openqa.selenium.Dimension dims = driver.manage().window().getSize();
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .77));
		Point end = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .77));
		// Perform swipe
		doSwipe(driver, start, end, 2000);

		// Get the volume level
		String volumeText = driver
				.findElement(AppiumBy.xpath("//android.view.View/android.widget.TextView[contains(@text, '%')]"))
				.getText();

		// Assertions
		assertTrue(volumeText.contains("75%"));
	}

	@Test
	public void testVolume25()
	{
		// Wait for page to load
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
		// Get the size of the screen
		org.openqa.selenium.Dimension dims = driver.manage().window().getSize();
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .77));
		Point end = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .77));
		// Perform swipe
		doSwipe(driver, start, end, 2000);

		// Get the volume level
		String volumeText = driver
				.findElement(AppiumBy.xpath("//android.view.View/android.widget.TextView[contains(@text, '%')]"))
				.getText();

		// Assertions
		//assertTrue(volumeText.contains("75%"));
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
