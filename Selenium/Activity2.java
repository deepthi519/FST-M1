import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w=new FirefoxDriver();
		w.get("https://training-support.net/webelements/login-form/");
		System.out.println(w.getTitle());
		WebElement username=w.findElement(By.xpath("//form/input[@id='username']"));
		username.sendKeys("admin");
		WebElement password=w.findElement(By.id("password"));
		password.sendKeys("password");
		w.findElement(By.xpath("//button")).click();
		System.out.println(w.findElement(By.tagName("h1")).getText());
		w.quit();

	}

}
