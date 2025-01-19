import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/keyboard-events");
		System.out.println(driver.getTitle());
		 Actions builder = new Actions(driver);
		 
		 builder.sendKeys("hi this is deepthi").build().perform();
		 String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
	        System.out.println(pageText);
	        driver.quit();
		 
	}

}
