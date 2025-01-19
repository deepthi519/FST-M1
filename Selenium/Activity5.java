import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("title of page is"+driver.getTitle());
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox']"));
		WebElement toogleCheckboxButton=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		System.out.println("check box dispalyed?:"+checkbox.isDisplayed());
		if(checkbox.isDisplayed())
		{
			toogleCheckboxButton.click();
		}
		System.out.println("after click on toogle check box dispalyed?:"+checkbox.isDisplayed());
		driver.quit();
	}

}
