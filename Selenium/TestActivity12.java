package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity12 {
public static void main(String[] args) {
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Open browser
		driver.get("https://training-support.net/webelements/dynamic-content");
		driver.manage().window().maximize();
		
        System.out.println(driver.getTitle());
		
		//Find the "click me!" button on the page
		driver.findElement(By.id("genButton")).click();
		
		//Wait until release
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"),"release"));
		
		//get the text & print it to console
		System.out.println(driver.findElement(By.id("word")).getText());
		
		driver.quit();
}
}
