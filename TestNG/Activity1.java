package Activity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity1 {
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
		driver.get("https://training-support.net");

	}

	@Test(priority = 1)
	public void verifyPageTitle() {

		// Use getTitle() to get and print the title of the page.
		// Make an assertion using assertEquals()
		// to make sure the title of the page is "Training Support"
		assertEquals(driver.getTitle(), "Training Support");

	}

	@Test(priority = 2)
	public void verifyAboutPage() {

		// Use findElement() to find the "About Us" Button on the page and click it
		driver.findElement(By.linkText("About Us")).click();

		// wait till page loads
		wait.until(ExpectedConditions.titleContains("About"));

		// assert page title
		assertEquals(driver.getTitle(), "About Training Support");
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}
