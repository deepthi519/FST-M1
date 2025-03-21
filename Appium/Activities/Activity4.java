package Activitys;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
AppiumDriver driver;
WebDriverWait wait;

@BeforeClass
public void setup() throws MalformedURLException, URISyntaxException
{
	// Desired Capabilities
	UiAutomator2Options options = new UiAutomator2Options();
	options.setPlatformName("android");
	options.setAutomationName("UiAutomator2");
	options.setAppPackage("com.android.contacts");
	options.setAppActivity(".activities.PeopleActivity");

	// Server Address
	URL serverURL = new URI("http://localhost:4723").toURL();
	// Driver Initialization
	driver = new AppiumDriver(serverURL, options);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
@Test
public void test()
{
	driver.findElement(AppiumBy.accessibilityId("Create new contact")).click();// Wait for elements to load
    wait.until(ExpectedConditions.elementToBeClickable(
            AppiumBy.xpath("//android.widget.EditText[@text='First name']")
    ));

    // Enter the details
    driver.findElement(AppiumBy.xpath(
            "//android.widget.EditText[@text='First name']"
    )).sendKeys("Aaditya");
    driver.findElement(AppiumBy.xpath(
            "//android.widget.EditText[@text='Last name']"
    )).sendKeys("Varma");
    driver.findElement(AppiumBy.xpath(
            "//android.widget.EditText[@text='Phone']"
    )).sendKeys("999148292");
    // Click Save
    driver.findElement(AppiumBy.id("editor_menu_save_button")).click();

    // Wait for contact to save
    wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));

    // Assertion
    String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
    Assert.assertEquals(contactName, "Aaditya Varma");
}

// Tear down method
@AfterClass
public void tearDown() {
    // Close the app
    driver.quit();

}
}