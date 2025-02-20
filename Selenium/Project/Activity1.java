package project;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Activity1 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");

	}
	@Test
	public void test() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();

	}


}
