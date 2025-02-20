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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.Visibility;



public class Activity4 
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
	        
	        Actions builder = new Actions(driver);
    	    builder.moveToElement(driver.findElement(By.xpath("//a[contains(@id,'menu_pim_viewPimModule')]/b"))).click();
    	    
    	    Thread.sleep(5);
    	    WebElement Add_button = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[contains(@id,'addEmployee')]"))));
    	    Add_button.click();

    	    WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
    	    WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
    	    WebElement save_button = driver.findElement(By.xpath("//input[@id='btnSave']"));

    	    firstName.sendKeys("Deepthi");
    	    lastName.sendKeys("Grandhi");
    	    save_button.click();
    	    System.out.println("save button is clicked");

    	    WebElement Pim_option = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[contains(@id,'menu_pim_viewPimModule')]"))));
    	    Pim_option.click();
    	    
    	    WebElement emp_name_input_search = driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
    	    emp_name_input_search.clear();
    	    emp_name_input_search.sendKeys("Deepthi Grandhi");
    	    

    	    WebElement search_button = driver.findElement(By.xpath("//input[@id='searchBtn']"));
    	    search_button.click();
    	    String firstName_entry = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]")).getText();
    	    System.out.println(firstName_entry);
    	    Assert.assertEquals(firstName_entry, "Deepthi"); 
    	    String lastName_entry = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[4]")).getText();
    	    System.out.println(lastName_entry);
    	    Assert.assertEquals(lastName_entry, "Grandhi"); 
    	 
    	    String id = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[2]")).getText();
    	    Assert.assertNotNull(id);
    	
    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }


}
