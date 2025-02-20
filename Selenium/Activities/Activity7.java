import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("title of page is"+driver.getTitle());
		WebElement TextField= driver.findElement(By.xpath("//input[@type='text']"));
		WebElement TextFieldEnableButton=driver.findElement(By.id("textInput"));

		// Check if it is selected
		System.out.println("textfield  is enabled: " + TextField.isEnabled());
		Thread.sleep(1000);	// Click the checkbox again
		if(!(TextField.isEnabled()))
		{
			TextFieldEnableButton.click();
		}
		System.out.println("after click on button dispalyed:"+TextField.isEnabled());
		// Type something in to it
		TextField.sendKeys("Example text");
		System.out.println(TextField.getDomProperty("value"));

		driver.quit();

	}

}
