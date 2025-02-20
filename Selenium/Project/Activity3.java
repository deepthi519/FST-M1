package project;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.Visibility;



public class Activity3 
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
	        
	        String homepage_welcome_text = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
	        Assert.assertEquals(homepage_welcome_text, "Welcome Aj");
	        System.out.println("The home page has opened");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }


}
