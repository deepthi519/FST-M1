package Activitys;

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


public class Activity2 {
	AppiumDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException
	{
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		// Server Address
		URL serverURL = new URI("http://localhost:4723").toURL();
		// Driver Initialization
		driver = new AndroidDriver(serverURL, options);
		driver.get("URL: https://training-support.net");
		wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	@Test
	public void testcase()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@text='Training Support']")));
		String text= driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
		System.out.println("heading:"+text);
		driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).click();
		String text1= driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).getText();
		System.out.println("hyperlink text:"+text1);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}

}
