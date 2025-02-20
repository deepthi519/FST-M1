import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("title of page is :"+driver.getTitle());
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		Select singleSelect = new Select(dropdown);
		singleSelect.selectByVisibleText("Two");
		singleSelect.selectByIndex(3);
		singleSelect.selectByValue("four");

		List<WebElement> options=singleSelect.getOptions();
		System.out.println("all listed options are as below");
		for(WebElement a : options)
		{
			System.out.println(a.getText());
		}
		driver.quit();

	}

}
