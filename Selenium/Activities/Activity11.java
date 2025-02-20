import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("title of page is"+driver.getTitle());
		WebElement chkbox=driver.findElement(By.xpath("//input[@id='checkbox']"));
		WebElement tooglechkbox=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		System.out.println("Checkbox is visible? " + chkbox.isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		tooglechkbox.click();
		wait.until(ExpectedConditions.invisibilityOf(chkbox));
		System.out.println("Checkbox is visible? " + chkbox.isDisplayed());
		tooglechkbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(chkbox)).click();
        chkbox.click();System.out.println("Checkbox is selected? " + chkbox.isSelected());
        // Close the browser
        driver.quit();
	}

}
