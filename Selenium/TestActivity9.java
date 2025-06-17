package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity9 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     Actions builder = new Actions(driver);
	     
			// Open the browser
			driver.get("https://training-support.net/webelements/keyboard-events");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			//type some text
			builder.sendKeys("This is some text with 123 and !@#@$@").build().perform();
			//On the page, type out a string from the selenium script to show on the page
			System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
			
			// Print the msg to the console
			
			//close browser
			driver.quit();
	}

}
