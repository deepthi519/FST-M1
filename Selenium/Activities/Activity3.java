import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w=new FirefoxDriver();
		w.get("https://training-support.net");
		System.out.println(w.getTitle());
		w.findElement(By.xpath("//a[@href='/about']")).click();
		w.get("https://training-support.net/webelements/login-form/");
		System.out.println(w.getTitle());
		WebElement username=w.findElement(By.xpath("//form/input[@id='username']"));
		username.sendKeys("admin");
		WebElement password=w.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("password");
		w.findElement(By.xpath("//button")).click();
		System.out.println(w.findElement(By.xpath("//h1[contains(@class, 'text-center')]")).getText());
		w.quit();

	}

}
