import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w=new FirefoxDriver();
		w.get("https://training-support.net");
		System.out.println(w.getTitle());
		w.findElement(By.linkText("About Us")).click();
		w.quit();

	}

}
