package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity3 {
	
	public static void main(String[] args) {
		
		// Initialize driver
				WebDriver driver = new FirefoxDriver();
				
				// Open the browser or page
				driver.get("https://training-support.net/webelements/login-form/");
				
				// Page Interactions
				// Print the title page
				System.out.println(driver.getTitle());
				
				//Find the User name and password fields
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
				
				// Find the submit button and click it
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				
				// Find the success message
				String message = driver.findElement(By.xpath("// h1[contains(@class, 'text-emerald-500')]")).getText();
				System.out.println(message);
				System.out.println(message.equals("Login Success!"));
				
				
				
				//Close the browser
				//driver.quit();  // all the tabs will be closed
	}

}
