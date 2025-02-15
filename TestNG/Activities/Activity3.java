package testNGActivities;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;

	@BeforeClass
	public void beforeclasssetup() {
		driver = new FirefoxDriver();
		// Open the page
		driver.get(" https://training-support.net/webelements/login-form/");
	}

	@Test(priority = 1)
	public void test() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

		username.sendKeys("admin");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));

		pwd.sendKeys("password");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Read login message
		String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
		Assert.assertEquals("Welcome Back, Admin!", loginMessage);

	}

	
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.close();
	}
}
