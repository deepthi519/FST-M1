import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://training-support.net/webelements/alerts
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		WebElement simpleButton=driver.findElement(By.xpath("//button[text()='Simple']"));
		simpleButton.click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.quit();
		
	}

}
