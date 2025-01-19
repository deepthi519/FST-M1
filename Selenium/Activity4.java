import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Page title: " + driver.getTitle());
		WebElement h3=driver.findElement(By.xpath("//h3[contains(text,h3)]"));
		System.out.println(h3.getText());
		WebElement h5=driver.findElement(By.xpath("//h3[contains(text,h5)]"));
		System.out.println(h5.getCssValue("color"));
		
		System.out.println(driver.findElement(By.xpath("//button[@text()='Purple']")).getClass());
		
		driver.quit();
	}

}
