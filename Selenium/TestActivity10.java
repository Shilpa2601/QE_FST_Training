package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity10 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     Actions builder = new Actions(driver);
	     
			// Open the browser
			driver.get("https://training-support.net/webelements/drag-drop");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			//Find all the elements
			WebElement ball = driver.findElement(By.id("ball"));
			WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
			WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
			
			//drag to move it into "Dropzone 1"
			builder.dragAndDrop(ball, dropzone1).pause(3000).build().perform();
			
			// or builder.clickAndHold(ball).moveToElement(dropzone1).release().build().perform();
			
			//Verify that the ball has entered Dropzone 1
			System.out.println(dropzone1.getText());
			
			//Once verified, move the ball into "Dropzone 2"
			builder.dragAndDrop(ball, dropzone2).pause(3000).build().perform();
			
			//or builder.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();
			
			//Verify that the ball has entered Dropzone 2
			System.out.println(dropzone2.getText());

			//close browser
			driver.quit();
	}

}
