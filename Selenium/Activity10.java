import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/drag-drop");
		System.out.println("title of page is"+driver.getTitle());
		WebElement ball= driver.findElement(By.xpath("//img"));
		WebElement dropzone1=driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement dropzone2=driver.findElement(By.xpath("//div[@id='dropzone2']"));
		Actions action= new Actions(driver);
		action.dragAndDrop(ball, dropzone1).build().perform();
		if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
		action.dragAndDrop(dropzone1, dropzone2).build().perform();
		if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }
		driver.quit();
		
		
	}

}
