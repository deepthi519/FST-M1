package testNGActivities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
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
	@DataProvider(name="credentials")
	public static Object[][] creds() 
	{
		return new Object[][] { 
			{ "admin1", "password1", "Invalid Credentials" },
			{ "wrongAdmin", "wrongPassword", "Invalid Credentials" }
		};
	}
	@Test(dataProvider = "Credentials")
	public void loginTest(String username, String password, String expectedMessage) 
	{
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));

		// Clear the input fields
		usernameField.clear();
		passwordField.clear();
		// Enter the credentials and click Log in
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

		// Assert login message
		String loginMessage = driver.findElement(By.id("subheading")).getText();
		Assert.assertEquals(loginMessage, expectedMessage);
	}





	@AfterClass(alwaysRun = true)
	public void tearDown() 
	{
		// Close the browser
		driver.close();
	}
}
