package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;
	@BeforeClass
	public void beforeclasssetup()
	{
		driver = new FirefoxDriver();
		// Open the page
		driver.get(" https://training-support.net/webelements/target-practice/");
	}
	
	
	@Test(priority=1)
	public void test1()
	{
		// Assert page title
		Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	@Test(priority=2)
	public void Test2() {
		 WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
		 Assert.assertTrue(blackButton.isDisplayed());
	        Assert.assertEquals(blackButton.getText(), "black");
		
	}
	@Test(enabled=false)
	public void test3()
	{
		
	}
	@Test()
	public void test4()
	{
		String s = "deepthi";
		if (s.equals("deepthi"))
		{
			throw new SkipException("Skipping test case");
		}

	}
	
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.close();
	}


}
