package Activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity2 {
public static void main(String[] args) {
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();  //Max width
		
		
		// Open the browser or page
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Page Interactions
		// Print the title page
		System.out.println(driver.getTitle());
		
		//Find the User name and password fields
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		// Find the submit button and click it
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		// Find the success message
		String message = driver.findElement(By.tagName("h1")).getText();
		System.out.println(message.equals("Login Success!"));
		
		//Close the browser
		//driver.quit();  // all the tabs will be closed
	}

}
