import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://training-support.net/webelements/alerts
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		WebElement confirmAlert=driver.findElement(By.xpath("//button[text()='Confirmation']"));
		confirmAlert.click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		System.out.println("text displayed after clicking button:"+ driver.findElement(By.id("result")).getText());
		confirmAlert.click();
		Alert b=driver.switchTo().alert();
		System.out.println(b.getText());
		a.dismiss();
		System.out.println("text displayed after clicking button:"+ driver.findElement(By.id("result")).getText());
		
		
		driver.quit();
	}
}
