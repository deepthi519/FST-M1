import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println(driver.getTitle());
		WebElement button = driver.findElement(By.xpath("//button[text()='Open A New Tab']"));
		button.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(driver.getWindowHandles());
		// Switch focus to the latest tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        // Wait for the new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
        // Find and click the button on page to open another tab
        driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        driver.quit();
	}

}
