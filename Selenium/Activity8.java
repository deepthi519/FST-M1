import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://training-support.net/webelements/mouse-events");
	System.out.println(driver.getTitle());
	WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
    WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
    WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
    WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));

    Actions action = new Actions(driver);
    cargoLock.click();
    action.moveToElement(cargoToml).click().build().perform();
    String msg=driver.findElement(By.id("result")).getText();
    System.out.println(msg);
    action.doubleClick(srcButton);
    action.contextClick(targetButton).pause(3000).build().perform();
    action.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
    // Print the front side text
    String message = driver.findElement(By.id("result")).getText();
    System.out.println(message);
	driver.quit();
	
}
}
