package Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {

public static void main(String[] args) {
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		// Open the browser or page
		driver.get("https://training-support.net/");
		
		// Page Interactions
		// Print the title page
		System.out.println(driver.getTitle());
		
		// Close the browser
		//driver.close();       // the current active tab will be closed  , don't have return value
		
		driver.quit();  // all the tabs will be closed
	}
}
