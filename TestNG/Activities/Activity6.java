package testNGActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	 WebDriverWait wait;
	@BeforeClass(alwaysRun = true)
    public void setUp() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the browser
        driver.get(" https://training-support.net/webelements/login-form");
    }
	@Test
	@Parameters({ "username", "password"})
	public void test(String username, String password)
	{
		WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
 
        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
 
        // Wait for the success page to load
        wait.until(ExpectedConditions.titleContains("Success"));
 
        // Assert login message
        String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
    
		
	}
	 @AfterClass(alwaysRun = true)
	    public void tearDown() {
	        // Close the browser
	        driver.close();
	    }
}
