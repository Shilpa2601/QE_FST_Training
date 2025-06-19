package Activity;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

	// WebDriver declaration
		WebDriver driver;

		// WebDriverWait declaration
		WebDriverWait wait;

		@BeforeClass
		public void setUp() {

			// Initialize driver
			driver = new FirefoxDriver();

			// Initialize wait
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Open the page
			driver.get("https://training-support.net/webelements/target-practice/");
		}

		@Test(priority = 1)
		public void  verifyPageTitle() {

			//Assert page title
			assertEquals(driver.getTitle(), "Selenium: Target Practice");
		}
		
		@Test(priority = 2)
		public void verifyButtonText() {

			//Find the button with the text black
			String buttonText = driver.findElement(By.cssSelector("button.bg-slate-200")).getText(); 
			
			//Assert page title
			assertEquals(buttonText, "Black");
		}
		
		@Test(priority = 3, enabled = false)
		public void verifyHeadingText() {

			//Find the heading 
			String headingText = driver.findElement(By.tagName("h1")).getText(); 
			
			//Assert page title
			assertEquals(headingText, "Heading #1");
		}
		
		@Test(priority = 4)
		public void verifyFooterText() {

			throw new SkipException("This test will be skipped");
			
			//Find the button with the footer text
			//String footerText = driver.findElement(By.cssSelector("span.text-gray-500")).getText(); 
			
			//Assert page title
			//assertEquals(footerText, "CKLABS");
		}
		
		@AfterClass
		public void tearDown() {
			
			// Close the browser
			driver.quit();
		}

}
