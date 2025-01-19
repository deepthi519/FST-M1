import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("title of page is  :"+driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Deepthi Grandhi");
		driver.quit();
	}

}
