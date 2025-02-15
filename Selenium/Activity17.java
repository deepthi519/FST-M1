import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// https://training-support.net/webelements/selects
		WebDriver driver= new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(selectElement);
        multiSelect.selectByVisibleText("HTML");
        
        for (int i = 3; i <= 5; i++) {
            multiSelect.selectByIndex(i);
        }
        multiSelect.selectByValue("nodejs");
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
     // Deselect the 5th index option
        multiSelect.deselectByIndex(4);
        List<WebElement> selectedOptions1 = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions1) {
            System.out.println(option.getText());
        }
        driver.quit();

	}

}
