package project;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.Visibility;



public class Activity8 
{
	WebDriver driver ;
	WebDriverWait wait;
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}

	@Test
	public void test() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'Username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'Password')]"));
		WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));

		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		login.click();
		Thread.sleep(10);

		Thread.sleep(5);
		WebElement apply_leave = driver.findElement(By.xpath("//div[@class='quickLaunge']/a[contains(@href,'applyLeave')]"));
		apply_leave.click();
		Thread.sleep(5);
		WebElement leave_type_dropdown = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']"));
		Select select = new Select(leave_type_dropdown);
		select.selectByIndex(1);

		WebElement from_date = driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
		WebElement to_date = driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));

		from_date.clear();
		from_date.sendKeys("2025-03-01");
		to_date.clear();
		to_date.sendKeys("2025-03-13");

		driver.findElement(By.id("applyBtn")).click();

		driver.findElement(By.xpath("//a[contains(@href,'viewMyLeaveList')]")).click();
		String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[6]/a")).getText();
		System.out.println("Status of my leave is : "+status);

	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
