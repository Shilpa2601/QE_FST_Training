package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity15_2 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     Actions builder = new Actions(driver);
	     
			// Open the browser
			driver.get(" https://training-support.net/webelements/sliders");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			//Print the slider percentage given i.e, 50%
		    WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
			System.out.println(volumeValue.getText());
			
			//Find the slider
			WebElement slider = driver.findElement(By.id("volume"));
			
			//Move to 25%
			builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120, 0).
			release().pause(3000).build().perform();
			
			//Print the new value
			System.out.println(volumeValue.getText());
			
			//Move to 75%
			builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120, 0).
			release().pause(3000).build().perform();
			
			//Print the new value
			System.out.println(volumeValue.getText());
			
			//Close the browser
			driver.quit();
	}
}
